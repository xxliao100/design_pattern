package com.xxliao.pattern.creational.factory.abstract_factory.demo;

/**
 * @author xxliao
 * @description: �й�������Ʒ����
 * @date 2024/5/23 22:07
 */
public class ChineseDessertFactory implements DessertFactory {

    /**
     * @description  ��������
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
