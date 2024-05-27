package com.xxliao.pattern.structure.flyweight.demo;

/**
 * @author xxliao
 * @description: ������Ԫ�� Concrete FlyWeight��
 * @date 2024/5/25 17:20
 */
public class MoBike extends Bike{

    public MoBike(String color, float price) {
        super(color, price);
    }

    @Override
    public void print() {
        System.out.println("�����ɹ���MoBike---"+color+",�۸�" + price + "Ԫ");
    }
}
