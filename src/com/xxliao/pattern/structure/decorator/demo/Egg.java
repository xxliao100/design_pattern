package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: 具体装饰类 - 鸡蛋类
 * @date 2024/5/25 12:49
 */

public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood,1,"egg");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
