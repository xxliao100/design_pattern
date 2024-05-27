package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: ����Bike ���彨������
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
