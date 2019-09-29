package com.wisedoo.base.util;

import com.wisedoo.base.error.BusinessException;
import com.wisedoo.base.error.EmBusinessError;

import java.net.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: liujn
 * @Description: 获取本机MAC地址
 * @Date: 2019/9/27 11:21 PM
 * @Param:
 * @Return:
 **/
public class MacUtil {

    /***因为一台机器不一定只有一个网卡呀，所以返回的是数组是很合理的***/

    /**
     * @Author: liujn
     * @Description: 获取当前计算机所有mac地址【计算机有可能存在讴多个网卡】
     * @Date: 2019/9/27 11:50 PM
     * @Param:
     * @Return: mac地址集合
     **/
    public static List<String> getMacList() throws BusinessException{
        List<String> macList= null;
        try {
            Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
            StringBuilder sb = new StringBuilder();
            ArrayList<String> tmpMacList = new ArrayList<>();
            while (en.hasMoreElements()) {
                NetworkInterface iface = en.nextElement();
                List<InterfaceAddress> addrs = iface.getInterfaceAddresses();
                for (InterfaceAddress addr : addrs) {
                    InetAddress ip = addr.getAddress();
                    NetworkInterface network = NetworkInterface.getByInetAddress(ip);
                    if (network == null) {
                        continue;
                    }
                    byte[] mac = network.getHardwareAddress();
                    if (mac == null) {
                        continue;
                    }
                    sb.delete(0, sb.length());
                    for (int i = 0; i < mac.length; i++) {
                        sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                    }
                    tmpMacList.add(sb.toString());
                }
            }
            if (tmpMacList.size() <= 0) {
                return tmpMacList;
            }
            //去重，同一个网卡的ipv4,ipv6得到的mac都是一样的，肯定有重复
            macList = tmpMacList.stream().distinct().collect(Collectors.toList());
            //如果有多个mac地址则需要对地址进行排序， 方便后续作为对称加密密钥使用
            //使用java自带排序

        }catch (Exception e){
            e.printStackTrace();
            throw new BusinessException(EmBusinessError.UNKNOWN_ERROR, e.getMessage());
        }
        return macList;
    }

}

