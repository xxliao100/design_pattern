package com.xxliao.pattern.creational.factory.factory_method;

import com.xxliao.pattern.creational.factory.factory_method.demo.AmericanCoffeeFactory;
import com.xxliao.pattern.creational.factory.factory_method.demo.Coffee;
import com.xxliao.pattern.creational.factory.factory_method.demo.CoffeeStore;

/**
 * @author xxliao
 * @description: 工厂设计模式-工厂方法
 *
 * 定义：根据简单工厂的工厂类方法扩展时需要修改代码的缺点，可以使用工厂方法模式解决。定义一个抽象工厂，为每个对象创建一个具体产品类工厂，对象的创建在
 * 工厂子类中进行。
 *
 * 结构：
 * 1.抽象工厂(abstract factory): 提供创建产品的接口，调用者通过它访问具体工厂的工厂方法类创建产品。
 * 2.具体工厂（Concrete factory）: 实现抽象工厂的具体类，完成具体产品的创建。
 * 3.抽象产品: 例如：Coffee。
 * 4.具体产品：例如：AmericanCoffee.
 *
 * 优点：封装了创建对象的具体过程，将对象创建和业务逻辑层进行分离，用户只需要知道具体的工厂就可以创建对应的对象，新增产品时，只需要添加对应产品类和具体
 * 工厂子类就行，无需其它代码进行修改。
 *
 * 缺点：没新增一个产品，就需要增加一个产品类以及对应的工厂类，增加了系统复杂度。
 *
 *
 * @date 2024/5/23 22:19
 */

public class FactoryMethod {

    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
