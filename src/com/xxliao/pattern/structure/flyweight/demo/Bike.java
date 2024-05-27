package com.xxliao.pattern.structure.flyweight.demo;

/**
 * @author xxliao
 * @description: ������Ԫ�� FlyWeight , ������
 * @date 2024/5/25 17:17
 */
public abstract class Bike {

    protected String color;

    protected float price;

    public Bike(String color, float price) {
        this.color = color;
        this.price = price;
    }

    /**
     * @description  ��ӡ������Ϣ
     * @author  xxliao
     * @date  2024/5/25 17:19
     */
    public abstract void print();
}
