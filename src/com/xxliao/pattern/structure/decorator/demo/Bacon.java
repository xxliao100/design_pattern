package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: 具体装饰类 - 培根配料
 * @date 2024/5/25 12:51
 */

public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood,2,"bacon");
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
