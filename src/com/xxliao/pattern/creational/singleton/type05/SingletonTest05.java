package com.xxliao.pattern.creational.singleton.type05;

/**
 * @author xxliao
 * @description: ����ģʽ-����ʽ-�̲߳���ȫ-��һ�ж�
 *
 * ��ȱ�㣺���̰߳�ȫ���⣬ʵ�ʿ����в�ʹ�á�
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
    public static Singleton getInstance(){
        if(instance == null){// �����ж��¿��ܻ�������̣߳�����߳̽���󣬻ᴴ���������
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

}

