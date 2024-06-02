package com.xxliao.pattern.creational.factory.abstract_factory.demo;

/**
 * @author xxliao
 * @description: ����������Ʒ����
 * @date 2024/5/23 22:07
 */
public class AmericanDessertFactory implements DessertFactory {

    /**
     * @description  ��������
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
