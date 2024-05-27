package com.xxliao.pattern.behavioral.strategy.demo;

/**
 * @author xxliao
 * @description: 具体策略类 - 满300 - 30
 * @date 2024/5/27 17:09
 */

public class StrategyTwo implements Strategy{

    @Override
    public void show() {
        System.out.println("满300 - 30");
    }
}
