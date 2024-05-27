package com.xxliao.pattern.creational.factory.factory_method.demo;

/**
 * @author xxliao
 * @description: 美式咖啡工厂类
 * @date 2024/5/23 22:07
 */
public class AmericanCoffeeFactory implements CoffeeFactory{

    /**
     * @description  生产咖啡
     * @author  xxliao
     * @date  2024/5/23 22:07
     */
    public Coffee createCoffee(){

        return new AmericanCoffee();
    }
}
