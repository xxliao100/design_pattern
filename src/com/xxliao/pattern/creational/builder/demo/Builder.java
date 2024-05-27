package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: ����������
 * @date 2024/5/24 17:00
 */
public abstract class Builder {

    // ������Ʒ����
    Bike bike = new Bike();

    // build frame
    public abstract void buildFrame();

    // build seat
    public abstract void buildSeat();

    // define create bike method
    public abstract Bike createBike();
}
