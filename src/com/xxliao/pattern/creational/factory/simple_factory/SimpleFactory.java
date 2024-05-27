package com.xxliao.pattern.creational.factory.simple_factory;

import com.xxliao.pattern.creational.factory.simple_factory.demo.Coffee;
import com.xxliao.pattern.creational.factory.simple_factory.demo.CoffeeStore;

/**
 * @author xxliao
 * @description: �������ģʽ-�򵥹���ģʽ
 *
 * ��Ҫ�ṹ�ǣ�
 * 1.�����Ʒ������Abstract Class Coffee��
 * 2.�����Ʒ������American Coffee��
 * 3.���幤��: CoffeeSimpleFactory
 *
 * ���ݾ��룬ΪCoffee���һ��Coffee�򵥹�����CoffeeSimpleFactory����Coffee����������CoffeeStore���ȴ���CoffeeSimpleFactory����Ȼ�����
 * �ö�����п��ȴ�����
 *
 * �ŵ㣺��װ�˴�������Ĺ��̣����Ը��ݲ�����ֱ�ӻ�ȡ���󣬽�����Ĵ�����ҵ���߼���ֿ���������չ��
 * ȱ�㣺��Coffee��������ʱ��CoffeeSimpleFactory��createCoffee������Ҫ�޸ģ�Υ���˿���ԭ�򣨶���չ���ţ����޸Ĺرգ�
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
