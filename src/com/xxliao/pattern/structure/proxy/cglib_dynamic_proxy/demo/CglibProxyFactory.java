package com.xxliao.pattern.structure.proxy.cglib_dynamic_proxy.demo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xxliao
 * @description: cglib��������
 *
 * MethodInterceptor�ӿ� �̳��� Callback �࣬������intercept�������÷������ǻص�����������
 *
 * @date 2024/5/24 23:09
 */

public class CglibProxyFactory implements MethodInterceptor {


    // ά��һ��Ŀ�����
    private Object target;

    // ������������һ�����������
    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    // ����һ�����������target����Ĵ������
    public Object getProxyInstance() {
        // 1.����һ��������
        Enhancer enhancer = new Enhancer();
        // 2.���ø��࣬Ҳ����Ŀ�����class
        enhancer.setSuperclass(target.getClass());
        // 3.���ûص�����
        enhancer.setCallback(this);
        // 4.�����������Ҳ���Ǵ������
        return enhancer.create();
    }

    /**
     * @description  ��д��intercept�����������Ŀ�����ķ�����
     *
     * �������壺
     * o: �������
     * method: ��ʵ�����еķ�����Methodʵ����
     * objects: ʵ�ʲ�����
     * methodProxy : ��������еķ���Methodʵ��
     *
     * @author  xxliao
     * @date  2024/5/24 23:17
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib ������ִ��ǰ...");
        System.out.println("����ִ�еķ�����"+method.getName());
        Object returnVal = method.invoke(target, objects);
        System.out.println("cglib ������ִ�к�...");
        return returnVal;
    }
}
