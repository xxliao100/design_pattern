package com.xxliao.pattern.creational.factory.factory_method.demo;

/**
 * @author xxliao
 * @description: ��ʽ���ȹ�����
 * @date 2024/5/23 22:07
 */
public class AmericanCoffeeFactory implements CoffeeFactory{

    /**
     * @description  ��������
     * @author  xxliao
     * @date  2024/5/23 22:07
     */
    public Coffee createCoffee(){

        return new AmericanCoffee();
    }
}
