package com.xxliao.pattern.behavioral.strategy.demo;

/**
 * @author xxliao
 * @description: 具体策略类 -满1000 可换购200以内的任意商品
 * @date 2024/5/27 17:10
 */

public class StrategyThree implements Strategy {

    @Override
    public void show() {
        System.out.println("满1000 可换购200以内的任意商品");
    }
}
