package com.xxliao.pattern.structure.proxy.jdk_dynamic_proxy.demo;

import com.xxliao.pattern.structure.proxy.static_proxy.demo.IWorkDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xxliao
 * @description: ��������
 * @date 2024/5/24 18:35
 */
public class ProxyFactory {

    // Ŀ�����ͨ���ӿ����ۺ�
    private IWorkDao target;

    public ProxyFactory(IWorkDao target) {
        this.target = target;
    }

    public IWorkDao getProxy() {

        /**
         * ʹ��Proxy��ȡ�������newProxyInstance��������˵����
         *  ClassLoader loader : ������������ڼ��ش����࣬ʹ����ʵ���������������ɣ�
         *  Class<?>[] interfaces : ��ʵ������ʵ�ֵĽӿڣ�����ģʽ��ʵ����ʹ������Ҫʵ����ͬ�Ľӿڡ�
         *  InvocationHandler: �������ĵ��ô������
         */
        IWorkDao result = (IWorkDao) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * proxy: �������
                     * method: ��Ӧ�ڶ����ϵ��õĽӿڷ�����methodʵ��
                     * args�����������ýӿڷ���ʱ���ݵ�ʵ�ʲ�����
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("�������methodִ��֮ǰ...");
                        Object result = method.invoke(target, args);
                        System.out.println("�������methodִ��֮��...");
                        return result;
                    }
                }
        );
        return result;
    }
}
