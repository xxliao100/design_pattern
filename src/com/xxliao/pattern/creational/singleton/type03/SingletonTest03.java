package com.xxliao.pattern.creational.singleton.type03;

/**
 * @author xxliao
 * @description: 单例模式-懒汉式-线程不安全
 *
 * 优缺点： 达到了懒加载的效果，但是在多线程环境下有线程安全问题，实际开发中 不使用。
 * 
 * @date 2024/5/23 15:59
 */

public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance); // true
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
        if(instance == null){ // 有线程安全问题
            instance = new Singleton();
        }
        return instance;
    }

}

