package com.xxliao.pattern.creational.factory.simple_factory.demo;

/**
 * @author xxliao
 * @description: 咖啡简单工厂类
 * @date 2024/5/23 22:07
 */
public class CoffeeSimpleFactory {

    /**
     * @description  生产咖啡
     * @author  xxliao
     * @date  2024/5/23 22:07
     */
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        switch (type) {
            case "american":
                coffee = new AmericanCoffee();
                break;
            case "lattee":
                coffee = new LatteCoffee();
                break;
            default:
                break;
        }

        return coffee;
    }
}
