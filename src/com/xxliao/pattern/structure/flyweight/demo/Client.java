package com.xxliao.pattern.structure.flyweight.demo;

/**
 * @author xxliao
 * @description: ��Ԫģʽ ���Կͻ���
 * @date 2024/5/25 17:30
 */

public class Client {
    public static void main(String[] args) {
        Bike bike1 = BikeFlyWeightFactory.getBike("��ɫ", "mobike");
        Bike bike2 = BikeFlyWeightFactory.getBike("��ɫ", "ofobike");

        bike1.print();
        bike2.print();

        System.out.println("======================================================");
        Bike bike3 = BikeFlyWeightFactory.getBike("��ɫ", "ofobike");
        System.out.println(BikeFlyWeightFactory.bikeMap.size());
    }
}
