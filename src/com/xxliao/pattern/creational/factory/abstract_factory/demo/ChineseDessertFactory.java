package com.xxliao.pattern.creational.factory.abstract_factory.demo;

/**
 * @author xxliao
 * @description: 中式甜品工厂类
 * @date 2024/5/23 22:07
 */
public class ChineseDessertFactory implements DessertFactory {

    /**
     * @description  生产咖啡
     * @author  xxliao
     * @date  2024/5/23 22:07
     */
    public Coffee createCoffee(){

        return new ChineseCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new ChineseDessert();
    }
}
