package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: 抽象装饰类 - 配料类，继承FastFood，并聚合FastFood类
 * @date 2024/5/25 12:46
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }
}
