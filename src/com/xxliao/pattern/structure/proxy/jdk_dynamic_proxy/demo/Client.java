package com.xxliao.pattern.structure.proxy.jdk_dynamic_proxy.demo;

import com.xxliao.pattern.structure.proxy.static_proxy.demo.IWorkDao;
import com.xxliao.pattern.structure.proxy.static_proxy.demo.WorkDao;

/**
 * @author xxliao
 * @description: static proxy demo test class
 * @date 2024/5/24 18:38
 */
public class Client {

    public static void main(String[] args) {

        IWorkDao workDao = new WorkDao();
        ProxyFactory proxyFactory = new ProxyFactory(workDao);
        IWorkDao proxy = proxyFactory.getProxy();
        proxy.work();

        System.out.println(workDao.hashCode());
        System.out.println(proxy.hashCode());
        System.out.println(proxy == workDao);

    }
}
