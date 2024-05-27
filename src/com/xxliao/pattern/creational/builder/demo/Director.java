package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: 指挥者类
 * @date 2024/5/24 17:06
 */

public class Director {

    // 建造者类
    private Builder builder;

    // 构造方法 填充建造者
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    // 创建 产品
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
