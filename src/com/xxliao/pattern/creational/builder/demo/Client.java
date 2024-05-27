package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: 建造者模式 测试类
 * @date 2024/5/24 17:09
 */

public class Client {

    public static void main(String[] args) {
        YongJiuBikeBuilder yongJiuBikeBuilder = new YongJiuBikeBuilder();
        Director director = new Director(yongJiuBikeBuilder);
        Bike bike1 = director.construct();
        System.out.println(bike1);

        System.out.println("=====================================");

        FengHuangBikeBuilder fengHuangBikeBuilder = new FengHuangBikeBuilder();
        director.setBuilder(fengHuangBikeBuilder);
        Bike bike2 = director.construct();
        System.out.println(bike2);

    }
}
