package com.xxliao.pattern.creational.factory.simple_factory.demo;

/**
 * @author xxliao
 * @description: 咖啡店类
 * @date 2024/5/23 22:10
 */

public class CoffeeStore {

    /**
     * @description  咖啡点餐
     * @author  xxliao
     * @date  2024/5/23 22:12
     */
    public Coffee orderCoffee(String type) {
        // 创建简单工厂对象
        CoffeeSimpleFactory coffeeSimpleFactory = new CoffeeSimpleFactory();
        return coffeeSimpleFactory.createCoffee(type);
    }
}
