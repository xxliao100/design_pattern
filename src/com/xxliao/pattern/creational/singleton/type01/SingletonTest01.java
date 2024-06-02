package com.xxliao.pattern.creational.singleton.type01;

/**
 * @author xxliao
 * @description: ����ģʽ-����ʽ-��̬����
 *
 * ʵ��ԭ����̬������ģʽ����class loader���ƣ������˶��̵߳�ͬ�����⣬������ص�ʱ��ͽ���ʵ����ʼ����
 * �ŵ㣺д���򵥣�������ص�ʱ��������ʵ�����������˶��̵߳��߳�ͬ�����⡣
 * ȱ�㣺����ļ���ʱ�����ɳ�ʼ����û�дﵽ�����ص�Ч���������һ�����ڴ��˷ѡ�
 *
 * ʵ�ʿ������Ƽ�ʹ��
 *
 * @date 2024/5/23 15:59
 */

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance); // true
        System.out.println("instance.hashCode ="+ instance.hashCode());
        System.out.println("instance1.hashCode ="+ instance1.hashCode());
    }

}

/**
 * @description  ����ʽ-��̬����
 * @author  xxliao
 * @date  2024/5/23 16:00
 */
class Singleton {

    // ����˽�л�
    private Singleton() {}

    // �ڱ����ڲ���������ʵ��
    private final static Singleton instance = new Singleton();

    // �����ṩһ�������ľ�̬���������ڷ���ʵ������
    public static Singleton getInstance(){
        return instance;
    }


}