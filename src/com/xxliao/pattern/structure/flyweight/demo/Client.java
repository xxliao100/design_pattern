package com.xxliao.pattern.structure.flyweight.demo;

/**
 * @author xxliao
 * @description: 享元模式 测试客户端
 * @date 2024/5/25 17:30
 */

public class Client {
    public static void main(String[] args) {
        Bike bike1 = BikeFlyWeightFactory.getBike("橘色", "mobike");
        Bike bike2 = BikeFlyWeightFactory.getBike("黄色", "ofobike");

        bike1.print();
        bike2.print();

        System.out.println("======================================================");
        Bike bike3 = BikeFlyWeightFactory.getBike("黄色", "ofobike");
        System.out.println(BikeFlyWeightFactory.bikeMap.size());
    }
}
