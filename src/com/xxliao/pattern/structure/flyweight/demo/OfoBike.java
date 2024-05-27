package com.xxliao.pattern.structure.flyweight.demo;

/**
 * @author xxliao
 * @description: ������Ԫ�� Concrete FlyWeight��
 * @date 2024/5/25 17:20
 */
public class OfoBike extends Bike{

    public OfoBike(String color, float price) {
        super(color, price);
    }

    @Override
    public void print() {
        System.out.println("�����ɹ���OfoBike---"+color+",�۸�199Ԫ");
    }
}
