package com.xxliao.pattern.structure.flyweight.demo;

/**
 * @author xxliao
 * @description: 抽象享元类 FlyWeight , 单车类
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
     * @description  打印单车信息
     * @author  xxliao
     * @date  2024/5/25 17:19
     */
    public abstract void print();
}
