package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: �������ִ࣬��ʵ��������࣬����������ý����ߵķ�����ִ������
 * @date 2024/5/25 19:28
 */

public class Chef {

    public void cook() {
        System.out.println("chef process order������");
    }

    public void cancelCooking() {
        System.out.println("chef cancel cooking...");
    }
}
