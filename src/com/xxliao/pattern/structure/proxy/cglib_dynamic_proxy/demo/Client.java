package com.xxliao.pattern.structure.proxy.cglib_dynamic_proxy.demo;

/**
 * @author xxliao
 * @description: cglib ≤‚ ‘øÕªß∂À¿‡
 * @date 2024/5/24 23:22
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) cglibProxyFactory.getProxyInstance();
        proxyInstance.teach();
        System.out.println("teacherDao.hashCode="+teacherDao.hashCode());
        System.out.println("===============================================");
        System.out.println("proxyInstance.hashCode="+proxyInstance.hashCode());
        System.out.println(teacherDao == proxyInstance);
    }
}
