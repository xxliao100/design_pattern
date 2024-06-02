package com.xxliao.pattern.creational.singleton.type01;

/**
 * @author xxliao
 * @description: 单例模式-饿汉式-静态常量
 *
 * 实现原理：静态常量的模式基于class loader机制，避免了多线程的同步问题，在类加载的时候就进行实例初始化。
 * 优点：写法简单，在类加载的时候就完成了实例化，避免了多线程的线程同步问题。
 * 缺点：在类的加载时候就完成初始化，没有达到懒加载的效果，会造成一定的内存浪费。
 *
 * 实际开发中推荐使用
 *
 * @date 2024/5/23 15:59
 */

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance); // true
        System.out.println("instance.hashCode ="+ instance.hashCode());
        System.out.println("instance1.hashCode ="+ instance1.hashCode());
    }

}

/**
 * @description  饿汉式-静态常量
 * @author  xxliao
 * @date  2024/5/23 16:00
 */
class Singleton {

    // 构造私有化
    private Singleton() {}

    // 在本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 对外提供一个公共的静态方法，用于返回实例对象
    public static Singleton getInstance(){
        return instance;
    }


}