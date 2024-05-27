package com.xxliao.pattern.structure.proxy.jdk_dynamic_proxy.demo;

import com.xxliao.pattern.structure.proxy.static_proxy.demo.IWorkDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xxliao
 * @description: 代理工厂类
 * @date 2024/5/24 18:35
 */
public class ProxyFactory {

    // 目标对象，通过接口来聚合
    private IWorkDao target;

    public ProxyFactory(IWorkDao target) {
        this.target = target;
    }

    public IWorkDao getProxy() {

        /**
         * 使用Proxy获取代理对象，newProxyInstance方法参数说明：
         *  ClassLoader loader : 类加载器，用于加载代理类，使用真实对象的类加载器即可；
         *  Class<?>[] interfaces : 真实对象所实现的接口，代理模式真实对象和代理对象要实现相同的接口。
         *  InvocationHandler: 代理对象的调用处理程序。
         */
        IWorkDao result = (IWorkDao) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * proxy: 代理对象；
                     * method: 对应在对象上调用的接口方法的method实例
                     * args：代理对象调用接口方法时传递的实际参数。
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("代理对象method执行之前...");
                        Object result = method.invoke(target, args);
                        System.out.println("代理对象method执行之后...");
                        return result;
                    }
                }
        );
        return result;
    }
}
