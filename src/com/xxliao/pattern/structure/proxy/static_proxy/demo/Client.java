package com.xxliao.pattern.structure.proxy.static_proxy.demo;

/**
 * @author xxliao
 * @description: static proxy demo test class
 * @date 2024/5/24 18:38
 */
public class Client {

    public static void main(String[] args) {
        // ����Ŀ�����
        WorkDao workDao = new WorkDao();
        // ��ȡ�������
        WorkDaoProxy workDaoProxy = new WorkDaoProxy(workDao);
        // ִ�з���
        workDaoProxy.work();

        System.out.println(workDao.hashCode());
        System.out.println(workDaoProxy.hashCode());
        //System.out.println(workDao == workDaoProxy);

    }
}
