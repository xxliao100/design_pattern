package com.xxliao.pattern.creational.factory.simple_factory;

import com.xxliao.pattern.creational.factory.simple_factory.demo.Coffee;
import com.xxliao.pattern.creational.factory.simple_factory.demo.CoffeeStore;

/**
 * @author xxliao
 * @description: 工厂设计模式-简单工厂模式
 *
 * 主要结构是：
 * 1.抽象产品：例如Abstract Class Coffee；
 * 2.具体产品：例如American Coffee；
 * 3.具体工厂: CoffeeSimpleFactory
 *
 * 根据距离，为Coffee添加一个Coffee简单工厂类CoffeeSimpleFactory用于Coffee的生产，在CoffeeStore中先创建CoffeeSimpleFactory对象，然后根据
 * 该对象进行咖啡创建。
 *
 * 优点：封装了创建对象的过程，可以根据参数等直接获取对象，将对象的创建和业务逻辑层分开，易于扩展。
 * 缺点：当Coffee种类增加时候CoffeeSimpleFactory的createCoffee方法需要修改，违背了开闭原则（对扩展开放，对修改关闭）
 *
 * @date 2024/5/23 22:00
 */

public class SimpleFactory {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
