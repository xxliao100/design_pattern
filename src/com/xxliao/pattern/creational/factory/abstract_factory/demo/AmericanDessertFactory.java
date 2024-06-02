package com.xxliao.pattern.creational.factory.abstract_factory.demo;

/**
 * @author xxliao
 * @description: 美国烘培饮品工厂
 * @date 2024/5/23 22:07
 */
public class AmericanDessertFactory implements DessertFactory {

    /**
     * @description  生产咖啡
     * @author  xxliao
     * @date  2024/5/23 22:07
     */
    public Coffee createCoffee(){

        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new AmericanDessert();
    }
}
