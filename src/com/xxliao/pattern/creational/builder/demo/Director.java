package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: ָ������
 * @date 2024/5/24 17:06
 */

public class Director {

    // ��������
    private Builder builder;

    // ���췽�� ��佨����
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    // ���� ��Ʒ
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
