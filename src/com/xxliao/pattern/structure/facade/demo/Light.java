package com.xxliao.pattern.structure.facade.demo;

/**
 * @author xxliao
 * @description: 子系统类 - 灯类
 * @date 2024/5/25 14:39
 */
public class Light {

    public void on() {
        System.out.println("打开了灯...");
    }

    public void off() {
        System.out.println("关闭了灯...");
    }
}
