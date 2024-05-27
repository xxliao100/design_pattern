package com.xxliao.pattern.creational.builder.demo;

/**
 * @author xxliao
 * @description: ²úÆ·Àà
 * @date 2024/5/24 16:59
 */

public class Bike {

    private String frame;

    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
