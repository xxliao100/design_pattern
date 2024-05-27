package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: 抽象建造者类
 * @date 2024/5/24 17:00
 */
public abstract class Builder {

    // 单车产品对象
    Bike bike = new Bike();

    // build frame
    public abstract void buildFrame();

    // build seat
    public abstract void buildSeat();

    // define create bike method
    public abstract Bike createBike();
}
