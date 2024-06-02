package com.xxliao.pattern.creational.singleton.type04;

/**
 * @author xxliao
 * @description: 单例模式-懒汉式-线程安全-同步方法
 *
 * 优缺点：利用synchronized关键字修饰方法，达到了线程安全的问题，但是对整个方法加锁，效率太低，实际开发中不推荐使用。
 *
 * @date 2024/5/23 15:59
 */

public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode ="+ instance.hashCode());
        System.out.println("instance1.hashCode ="+ instance1.hashCode());
    }

}

/**
 * @description  懒汉式-线程不安全
 * @author  xxliao
 * @date  2024/5/23 16:00
 */
class Singleton {

    // 构造私有化
    private Singleton() {}

    // 在本类内部创建对象实例
    private static Singleton instance;

    // 对外提供一个公共的静态方法，用于返回实例对象
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

