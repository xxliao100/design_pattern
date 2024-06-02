package com.xxliao.pattern.creational.factory.abstract_factory.demo;

/**
 * @author xxliao
 * @description: ������Ʒ����
 * @date 2024/5/23 22:29
 */
public interface DessertFactory {

    // ��������
    Coffee createCoffee();

    // ������Ʒ
    Dessert createDessert();
}
