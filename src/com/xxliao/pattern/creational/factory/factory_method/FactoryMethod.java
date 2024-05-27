package com.xxliao.pattern.creational.factory.factory_method;

import com.xxliao.pattern.creational.factory.factory_method.demo.AmericanCoffeeFactory;
import com.xxliao.pattern.creational.factory.factory_method.demo.Coffee;
import com.xxliao.pattern.creational.factory.factory_method.demo.CoffeeStore;

/**
 * @author xxliao
 * @description: �������ģʽ-��������
 *
 * ���壺���ݼ򵥹����Ĺ����෽����չʱ��Ҫ�޸Ĵ����ȱ�㣬����ʹ�ù�������ģʽ���������һ�����󹤳���Ϊÿ�����󴴽�һ�������Ʒ�๤��������Ĵ�����
 * ���������н��С�
 *
 * �ṹ��
 * 1.���󹤳�(abstract factory): �ṩ������Ʒ�Ľӿڣ�������ͨ�������ʾ��幤���Ĺ��������ഴ����Ʒ��
 * 2.���幤����Concrete factory��: ʵ�ֳ��󹤳��ľ����࣬��ɾ����Ʒ�Ĵ�����
 * 3.�����Ʒ: ���磺Coffee��
 * 4.�����Ʒ�����磺AmericanCoffee.
 *
 * �ŵ㣺��װ�˴�������ľ�����̣������󴴽���ҵ���߼�����з��룬�û�ֻ��Ҫ֪������Ĺ����Ϳ��Դ�����Ӧ�Ķ���������Ʒʱ��ֻ��Ҫ��Ӷ�Ӧ��Ʒ��;���
 * ����������У�����������������޸ġ�
 *
 * ȱ�㣺û����һ����Ʒ������Ҫ����һ����Ʒ���Լ���Ӧ�Ĺ����࣬������ϵͳ���Ӷȡ�
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
