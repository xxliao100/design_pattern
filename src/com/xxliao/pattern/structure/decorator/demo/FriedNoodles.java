package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: 具体构建类 - 炒面类
 * @date 2024/5/25 12:45
 */

public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
