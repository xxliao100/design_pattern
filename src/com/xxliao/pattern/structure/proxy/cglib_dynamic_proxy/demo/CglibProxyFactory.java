package com.xxliao.pattern.structure.proxy.cglib_dynamic_proxy.demo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xxliao
 * @description: cglib代理工厂类
 *
 * MethodInterceptor接口 继承了 Callback 类，定义了intercept方法，该方法就是回调函数方法。
 *
 * @date 2024/5/24 23:09
 */

public class CglibProxyFactory implements MethodInterceptor {


    // 维护一个目标对象
    private Object target;

    // 构造器，传入一个被代理对象
    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    // 返回一个代理对象，是target对象的代理对象
    public Object getProxyInstance() {
        // 1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类，也是是目标对象class
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类对象，也就是代理对象
        return enhancer.create();
    }

    /**
     * @description  重写了intercept方法，会调用目标对象的方法。
     *
     * 参数含义：
     * o: 代理对象；
     * method: 真实对象中的方法的Method实例；
     * objects: 实际参数；
     * methodProxy : 代理对象中的方法Method实例
     *
     * @author  xxliao
     * @date  2024/5/24 23:17
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理方法执行前...");
        System.out.println("对象执行的方法是"+method.getName());
        Object returnVal = method.invoke(target, objects);
        System.out.println("cglib 代理方法执行后...");
        return returnVal;
    }
}
