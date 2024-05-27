package com.xxliao.pattern.creational.singleton.type04;

/**
 * @author xxliao
 * @description: ����ģʽ-����ʽ-�̰߳�ȫ-ͬ������
 *
 * ��ȱ�㣺����synchronized�ؼ������η������ﵽ���̰߳�ȫ�����⣬���Ƕ���������������Ч��̫�ͣ�ʵ�ʿ����в��Ƽ�ʹ�á�
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
 * @description  ����ʽ-�̲߳���ȫ
 * @author  xxliao
 * @date  2024/5/23 16:00
 */
class Singleton {

    // ����˽�л�
    private Singleton() {}

    // �ڱ����ڲ���������ʵ��
    private static Singleton instance;



    // �����ṩһ�������ľ�̬���������ڷ���ʵ������
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

