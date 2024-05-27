package com.xxliao.pattern.creational.singleton.type08;

/**
 * @author xxliao
 * @description: 单例模式-枚举类
 *
 * 优缺点：利用枚举类是线程安全的，
 *
 * 实际开发中推荐使用。
 *
 * @date 2024/5/23 15:59
 */

public class SingletonTest08 {


    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1 == instance);
        System.out.println("instance.hashCode ="+ instance.hashCode());
        System.out.println("instance1.hashCode ="+ instance1.hashCode());
    }

    /**
     * @description  枚举类
     * @author  xxliao
     * @date  2024/5/23 16:00
     */
    enum Singleton {

        INSTANCE;

    }

}



