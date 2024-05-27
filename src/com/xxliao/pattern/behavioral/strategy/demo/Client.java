package com.xxliao.pattern.behavioral.strategy.demo;


/**
 * @author xxliao
 * @description: 策略模式 测试客户端
 * @date 2024/5/27 17:12
 */
public class Client {

    public static void main(String[] args) {
        //
        Context context = new Context(new StrategyOne());
        context.sale();

    }
}
