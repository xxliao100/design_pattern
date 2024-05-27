package com.xxliao.pattern.behavioral.strategy.demo;

/**
 * @author xxliao
 * @description: 具体策略类 - 买一送一
 * @date 2024/5/27 17:08
 */
public class StrategyOne implements Strategy{

    @Override
    public void show() {
        System.out.println("买一送一。。。");
    }
}
