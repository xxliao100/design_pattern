package com.xxliao.pattern.creational.factory.abstract_factory;

import com.xxliao.pattern.creational.factory.abstract_factory.demo.AmericanDessertFactory;
import com.xxliao.pattern.creational.factory.abstract_factory.demo.ChineseDessertFactory;
import com.xxliao.pattern.creational.factory.abstract_factory.demo.Coffee;
import com.xxliao.pattern.creational.factory.abstract_factory.demo.Dessert;

/**
 * @author xxliao
 * @description: 设计模式-工厂模式-抽象工厂模式
 *
 * 定义：抽象工厂模式是 工厂方法的升级版，工厂方法是一个产品就有一个具体的工厂类，抽象工厂是顶级抽象工厂可以生产多种产品，然后子类工厂实现类可以生产
 * 产品一类，例如：定义工厂定义可以生产coffee和dessert，子类AmericanDessertFacTory可以生产AmericanCoffee和AmericanDessert。
 *
 * 结构：
 * 1.抽象工厂(abstract factory): 提供创建产品的接口，包含多个产品的拆创建方法，可以创建多个不同维度的产品。
 * 2.具体工厂（Concrete factory）: 实现抽象工厂的具体类，完成具体一系列产品的创建。
 * 3.抽象产品: 例如：Coffee。
 * 4.具体产品：例如：AmericanCoffee.
 *
 * 优点：当一个产品族中多个对象被设计一起生产时，抽象工厂模式可以保证客户端始终只使用同一个产品族中的对象。
 * 缺点：产品族中新增一个产品时候，所有的工厂类都需要修改。
 *
 * @date 2024/5/23 22:59
 */

public class AbstractFactory {

    public static void main(String[] args) {
        // 拿到工厂类
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        // 生产一系列产品
        Coffee americanCoffee = americanDessertFactory.createCoffee();
        Dessert americanDessert = americanDessertFactory.createDessert();
        System.out.println(americanDessert.getName());
        System.out.println(americanCoffee.getName());
        System.out.println("==========================================");
        // 拿到工厂类
        ChineseDessertFactory chineseDessertFactory = new ChineseDessertFactory();
        // 生产一系列产品
        Coffee chineseCoffee = chineseDessertFactory.createCoffee();
        Dessert chineseDessert = chineseDessertFactory.createDessert();
        System.out.println(chineseCoffee.getName());
        System.out.println(chineseDessert.getName());
    }
}
