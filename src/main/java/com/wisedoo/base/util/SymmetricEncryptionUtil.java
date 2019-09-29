package com.wisedoo.base.util;

import com.wisedoo.base.error.BusinessException;
import com.wisedoo.base.error.EmBusinessError;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

/**
 * @Author: liujn
 * @Description: AES加密和解密
 * @Date: 2019/9/28 9:25 AM
 **/
public class SymmetricEncryptionUtil {

    private static final String AES = "AES";
    private static final String SHA1PRNG = "SHA1PRNG";

    /**
     * 设置加密密码处理长度。
     * 不足此长度补0；
     */
    private static final int PWD_SIZE = 16;

    /**
     * 密码处理方法
     * 如果加解密出问题，
     * 请先查看本方法，排除密码长度不足补"0",导致密码不一致
     *
     * @param password 待处理的密码
     * @return
     */
    private static byte[] pwdHandler(String password) {
        if (password == null) {
            password = "";
        }
        StringBuffer sb = new StringBuffer(PWD_SIZE);
        sb.append(password);
        while (sb.length() < PWD_SIZE) {
            sb.append("0");
        }
        if (sb.length() > PWD_SIZE) {
            sb.setLength(PWD_SIZE);
        }
        String pwdStr = sb.toString();
        return pwdStr.getBytes(StandardCharsets.UTF_8);
    }

    /**
     * @Author: liujn
     * @Description: 根据密钥对数据进行AES加密
     * @Date: 2019/9/28 9:14 AM
     * @Param: String encodeRules 密钥, String content 数据
     * @Return: String 加密后数据
     **/
    public static String AESEncode(String encodeRules, String content) throws BusinessException {
        String aesEnCode = null;
        try {
            //1.构造密钥生成器，指定为AES算法,不区分大小写
            KeyGenerator keygen = KeyGenerator.getInstance(AES);
            SecureRandom random = SecureRandom.getInstance(SHA1PRNG);
            random.setSeed(encodeRules.getBytes());
            keygen.init(128, random);
            //2.获得原始对称密钥的字节数组
            byte[] raw = pwdHandler(encodeRules);
            //3.根据字节数组生成AES密钥
            SecretKey key = new SecretKeySpec(raw, AES);
            //4.根据指定算法AES自成密码器
            Cipher cipher = Cipher.getInstance(AES);
            //5.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密解密(Decrypt_mode)操作，第二个参数为使用的KEY
            cipher.init(Cipher.ENCRYPT_MODE, key);
            //6.获取加密内容的字节数组(这里要设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            byte[] byte_encode = content.getBytes(StandardCharsets.UTF_8);
            //7.根据密码器的初始化方式--加密：将数据加密
            byte[] byte_AES = cipher.doFinal(byte_encode);
            //8.将加密后的数据转换为字符串
            //这里用Base64Encoder中会找不到包
            //解决办法：
            //在项目的Build path中先移除JRE System Library，再添加库JRE System Library，重新编译后就一切正常了。
            aesEnCode = new BASE64Encoder().encode(byte_AES);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(EmBusinessError.UNKNOWN_ERROR, e.getMessage());
        }
        return aesEnCode;
    }


    /**
     * @Author: liujn
     * @Description: 根据密钥以及加密后对数据进行解密
     * @Date: 2019/9/28 9:20 AM
     * @Param: String encodeRules 密钥 String content 加密后数据
     * @Return: 解密后数据
     **/
    public static String AESDncode(String encodeRules, String content) throws BusinessException {
        String aesDecode = null;
        try {
            //1.构造密钥生成器，指定为AES算法,不区分大小写
            KeyGenerator keygen = KeyGenerator.getInstance(AES);
            //2.根据ecnodeRules规则初始化密钥生成器
            //生成一个128位的随机源,根据传入的字节数组
            SecureRandom random = SecureRandom.getInstance(SHA1PRNG);
            random.setSeed(encodeRules.getBytes());
            keygen.init(128, random);
            //3.获得原始对称密钥的字节数组
            //byte[] raw = original_key.getEncoded();
            byte[] raw = pwdHandler(encodeRules);
            //4.根据字节数组生成AES密钥
            SecretKey key = new SecretKeySpec(raw, AES);
            //5.根据指定算法AES自成密码器
            Cipher cipher = Cipher.getInstance(AES);
            //6.初始化密码器，第一个参数为加密(Encrypt_mode)或者解密(Decrypt_mode)操作，第二个参数为使用的KEY
            cipher.init(Cipher.DECRYPT_MODE, key);
            //7.将加密并编码后的内容解码成字节数组
            byte[] byte_content = new BASE64Decoder().decodeBuffer(content);
            //解密
            byte[] byte_decode = cipher.doFinal(byte_content);
            aesDecode = new String(byte_decode, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException(EmBusinessError.UNKNOWN_ERROR, e.getMessage());
        }
        return aesDecode;
    }


}