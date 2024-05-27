package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: 永久Bike 具体建造者类
 * @date 2024/5/24 17:03
 */
public class YongJiuBikeBuilder extends Builder{


    @Override
    public void buildFrame() {
        bike.setFrame("yongjiu-frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("yongjiu-seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
