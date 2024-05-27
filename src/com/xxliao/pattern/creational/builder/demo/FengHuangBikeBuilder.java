package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: 凤凰自行车 具体建造类
 * @date 2024/5/24 17:05
 */
public class FengHuangBikeBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("fenghuang-frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("fenghuang-seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
