package com.xxliao.pattern.creational.factory.simple_factory.demo;

/**
 * @author xxliao
 * @description: ���ȵ���
 * @date 2024/5/23 22:10
 */

public class CoffeeStore {

    /**
     * @description  ���ȵ��
     * @author  xxliao
     * @date  2024/5/23 22:12
     */
    public Coffee orderCoffee(String type) {
        // �����򵥹�������
        CoffeeSimpleFactory coffeeSimpleFactory = new CoffeeSimpleFactory();
        return coffeeSimpleFactory.createCoffee(type);
    }
}
