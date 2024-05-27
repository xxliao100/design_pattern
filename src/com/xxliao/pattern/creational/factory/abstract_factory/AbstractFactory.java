package com.xxliao.pattern.creational.factory.abstract_factory;

import com.xxliao.pattern.creational.factory.abstract_factory.demo.AmericanDessertFactory;
import com.xxliao.pattern.creational.factory.abstract_factory.demo.ChineseDessertFactory;
import com.xxliao.pattern.creational.factory.abstract_factory.demo.Coffee;
import com.xxliao.pattern.creational.factory.abstract_factory.demo.Dessert;

/**
 * @author xxliao
 * @description: ���ģʽ-����ģʽ-���󹤳�ģʽ
 *
 * ���壺���󹤳�ģʽ�� ���������������棬����������һ����Ʒ����һ������Ĺ����࣬���󹤳��Ƕ������󹤳������������ֲ�Ʒ��Ȼ�����๤��ʵ�����������
 * ��Ʒһ�࣬���磺���幤�������������coffee��dessert������AmericanDessertFacTory��������AmericanCoffee��AmericanDessert��
 *
 * �ṹ��
 * 1.���󹤳�(abstract factory): �ṩ������Ʒ�Ľӿڣ����������Ʒ�Ĳ𴴽����������Դ��������ͬά�ȵĲ�Ʒ��
 * 2.���幤����Concrete factory��: ʵ�ֳ��󹤳��ľ����࣬��ɾ���һϵ�в�Ʒ�Ĵ�����
 * 3.�����Ʒ: ���磺Coffee��
 * 4.�����Ʒ�����磺AmericanCoffee.
 *
 * �ŵ㣺��һ����Ʒ���ж���������һ������ʱ�����󹤳�ģʽ���Ա�֤�ͻ���ʼ��ֻʹ��ͬһ����Ʒ���еĶ���
 * ȱ�㣺��Ʒ��������һ����Ʒʱ�����еĹ����඼��Ҫ�޸ġ�
 *
 * @date 2024/5/23 22:59
 */

public class AbstractFactory {

    public static void main(String[] args) {
        // �õ�������
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        // ����һϵ�в�Ʒ
        Coffee americanCoffee = americanDessertFactory.createCoffee();
        Dessert americanDessert = americanDessertFactory.createDessert();
        System.out.println(americanDessert.getName());
        System.out.println(americanCoffee.getName());
        System.out.println("==========================================");
        // �õ�������
        ChineseDessertFactory chineseDessertFactory = new ChineseDessertFactory();
        // ����һϵ�в�Ʒ
        Coffee chineseCoffee = chineseDessertFactory.createCoffee();
        Dessert chineseDessert = chineseDessertFactory.createDessert();
        System.out.println(chineseCoffee.getName());
        System.out.println(chineseDessert.getName());
    }
}
