package com.xxliao.pattern.creational.singleton.type07;

/**
 * @author xxliao
 * @description: ����ģʽ-����ʽ-�̰߳�ȫ-��̬�ڲ���
 *
 * ��ȱ�㣺����������ػ��ƣ�ʵ����ʼ��ֻ��һ���̣߳���̬�ڲ��������౻���ص�ʱ�򲻻�����ʵ������ʹ��ʱ��ų�ʼ�����ﵽ�������غ��̰߳�ȫ��������
 *
 * ʵ�ʿ������Ƽ�ʹ�á�
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
 * @description  ����ʽ-�̰߳�ȫ
 * @author  xxliao
 * @date  2024/5/23 16:00
 */
class Singleton {

    // ����˽�л�
    private Singleton() {}

    // �ڱ����ڲ���������ʵ��
    private static Singleton instance;


    // ����һ����̬�ڲ��࣬�����һ����̬����Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    // �����ṩһ�������ľ�̬���������ڷ���ʵ������
    public static Singleton getInstance(){

        return SingletonInstance.INSTANCE;
    }

}

