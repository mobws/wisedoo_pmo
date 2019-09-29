package com.wisedoo.test;


import com.wisedoo.base.error.BusinessException;
import com.wisedoo.base.util.MacUtil;
import com.wisedoo.base.util.SymmetricEncryptionUtil;

import javax.crypto.Mac;
import java.util.List;

/**
 * @ClassName: test
 * @Description: TODO
 * @Auther: liujn
 * @Date: 2019/9/28 9:33 AM
 * @Version 1.0
 */
public class test {

    public static void main(String[] args) {

        try {
            List<String> macList = MacUtil.getMacList();
            System.out.println("mac地址：");
            System.out.println(macList.toString());

            String str = "123456789";
            //如果有多个mac地址则进行多层加密
            //开始加密
            System.out.println("开始加密：");
            String enCode = str;
            int i = 1;
            for(String key : macList){
                System.out.println("第"+i+"次加密：");
                enCode = SymmetricEncryptionUtil.AESEncode(key, enCode);
                System.out.println("内容：" + enCode);
                i++;
            }

            //开始解密
            System.out.println("开始解密：");
            String deCode = enCode;
            int j = 1;
            for(int n = macList.size()-1; n>=0; n--){
                System.out.println("第"+j+"次解密：");
                deCode = SymmetricEncryptionUtil.AESDncode(macList.get(n), deCode);
                System.out.println("内容：" + deCode);
                j++;
            }

//            for(String key : macList){
//                System.out.println("第"+j+"次解密：");
//                deCode = SymmetricEncryptionUtil.AESDncode(key, deCode);
//                System.out.println("内容：" + deCode);
//                j++;
//            }



//            String key = macList.get(0);
//            String str = macList.get(1);
//
//            System.out.println("密钥：" + key);
//            System.out.println("内容：" + str);
//
//            System.out.println("加密：");
//            String enCode = SymmetricEncryptionUtil.AESEncode(key, str);
//            System.out.println(enCode);
//
//            System.out.println("解密：");
//            String dnCode = SymmetricEncryptionUtil.AESDncode(key, enCode);
//            System.out.println(dnCode);

        } catch (BusinessException e) {
            e.printStackTrace();
        }

    }


}
