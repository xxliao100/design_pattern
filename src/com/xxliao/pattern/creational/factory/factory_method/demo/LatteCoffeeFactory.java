package com.xxliao.pattern.creational.factory.factory_method.demo;

/**
 * @author xxliao
 * @description: �������ȹ�����
 * @date 2024/5/23 22:07
 */
public class LatteCoffeeFactory implements CoffeeFactory{

    /**
     * @description  ��������
     * @author  xxliao
     * @date  2024/5/23 22:07
     */
    public Coffee createCoffee(){

        return new LatteCoffee();
    }
}
