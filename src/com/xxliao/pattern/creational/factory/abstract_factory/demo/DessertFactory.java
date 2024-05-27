package com.xxliao.pattern.creational.factory.abstract_factory.demo;

/**
 * @author xxliao
 * @description: 甜品抽象工厂类
 * @date 2024/5/23 22:29
 */

public interface DessertFactory {

    // 生产咖啡
    Coffee createCoffee();


    // 生产甜品
    Dessert createDessert();
}
