package com.xxliao.pattern.creational.singleton.type07;

/**
 * @author xxliao
 * @description: 单例模式-懒汉式-线程安全-静态内部类
 *
 * 优缺点：利用了类加载机制：实例初始化只有一个线程，静态内部类在外类被加载的时候不会立即实例化，使用时候才初始化，达到了懒加载和线程安全的条件。
 *
 * 实际开发中推荐使用。
 *
 * @date 2024/5/23 15:59
 */

public class SingletonTest07 {


    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode ="+ instance.hashCode());
        System.out.println("instance1.hashCode ="+ instance1.hashCode());
    }

}

/**
 * @description  懒汉式-线程安全
 * @author  xxliao
 * @date  2024/5/23 16:00
 */
class Singleton {

    // 构造私有化
    private Singleton() {}

    // 在本类内部创建对象实例
    private static Singleton instance;


    // 定义一个静态内部类，该类的一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    // 对外提供一个公共的静态方法，用于返回实例对象
    public static Singleton getInstance(){

        return SingletonInstance.INSTANCE;
    }

}

