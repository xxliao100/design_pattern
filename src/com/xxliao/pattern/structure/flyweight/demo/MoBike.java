package com.xxliao.pattern.structure.flyweight.demo;

/**
 * @author xxliao
 * @description: 具体享元类 Concrete FlyWeight，
 * @date 2024/5/25 17:20
 */
public class MoBike extends Bike{

    public MoBike(String color, float price) {
        super(color, price);
    }

    @Override
    public void print() {
        System.out.println("生产成功：MoBike---"+color+",价格" + price + "元");
    }
}
