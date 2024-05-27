package com.xxliao.pattern.structure.proxy.static_proxy.demo;

/**
 * @author xxliao
 * @description: static proxy demo test class
 * @date 2024/5/24 18:38
 */
public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        WorkDao workDao = new WorkDao();
        // 获取代理对象
        WorkDaoProxy workDaoProxy = new WorkDaoProxy(workDao);
        // 执行方法
        workDaoProxy.work();

        System.out.println(workDao.hashCode());
        System.out.println(workDaoProxy.hashCode());
        //System.out.println(workDao == workDaoProxy);

    }
}
