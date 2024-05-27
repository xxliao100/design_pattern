package com.xxliao.pattern.creational.factory.abstract_factory.demo;

/**
 * @author xxliao
 * @description: 国产中式咖啡
 * @date 2024/5/23 22:05
 */
public class ChineseCoffee extends Coffee {

    private String name = "ChineseCoffee";

    @Override
    public String getName() {
        return name;
    }
}
