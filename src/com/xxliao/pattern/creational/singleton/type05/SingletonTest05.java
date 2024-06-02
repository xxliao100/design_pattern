package com.xxliao.pattern.creational.singleton.type05;

/**
 * @author xxliao
 * @description: 单例模式-懒汉式-线程不安全-单一判断
 *
 * 优缺点：有线程安全问题，实际开发中不使用。
 *
 * @date 2024/5/23 15:59
 */
public class SingletonTest05 {

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
    public static Singleton getInstance(){
        if(instance == null){// 整个判断下可能会进入多个线程，多个线程进入后，会创建多个对象。
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

}

