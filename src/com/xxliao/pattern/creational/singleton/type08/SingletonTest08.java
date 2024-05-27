package com.xxliao.pattern.creational.singleton.type08;

/**
 * @author xxliao
 * @description: ����ģʽ-ö����
 *
 * ��ȱ�㣺����ö�������̰߳�ȫ�ģ�
 *
 * ʵ�ʿ������Ƽ�ʹ�á�
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
     * @description  ö����
     * @author  xxliao
     * @date  2024/5/23 16:00
     */
    enum Singleton {

        INSTANCE;

    }

}



