package com.xxliao.pattern.behavioral.strategy.demo;

/**
 * @author xxliao
 * @description: »·¾³½ÇÉ«
 * @date 2024/5/27 17:11
 */

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sale() {
        this.strategy.show();
    }
}
