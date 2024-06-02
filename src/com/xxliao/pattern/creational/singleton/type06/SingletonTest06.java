package com.xxliao.pattern.creational.singleton.type06;

/**
 * @author xxliao
 * @description: 单例模式-懒汉式-线程安全-同步方法
 *
 * 优缺点：实现了懒加载，并且没有线程安全问题，效率高，
 *
 * 实际开发中推荐使用。
 *
 * @date 2024/5/23 15:59
 */

public class SingletonTest06 {


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



    // 对外提供一个公共的静态方法，用于返回实例对象
    public static Singleton getInstance(){
        if(instance == null){// 整个判断下可能会进入多个线程，多个线程进入后，会创建多个对象。
            synchronized(Singleton.class){
                if(instance == null) { // 这里再次判断，可以排除多个线程进入第一个判断后，创建多个对象情况出现。
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

