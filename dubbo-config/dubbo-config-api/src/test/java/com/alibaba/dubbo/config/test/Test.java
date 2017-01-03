package com.alibaba.dubbo.config.test;

import com.alibaba.dubbo.common.utils.NetUtils;

import java.net.Inet4Address;
import java.net.UnknownHostException;

/**
 * Created with IntelliJ IDEA.
 * User: qinfajia
 * Date: 16-8-22
 * Time: 下午1:38
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) throws UnknownHostException {
        String host = Inet4Address.getLocalHost().getHostAddress();
        System.out.println(NetUtils.isInvalidLocalHost(host));
    }
}
