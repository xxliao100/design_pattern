package com.xxliao.pattern.structure.facade.demo;

/**
 * @author xxliao
 * @description: 子系统类 - 空调类
 * @date 2024/5/25 14:58
 */
public class AirCondition {

    public void on() {
        System.out.println("打开了空调...");
    }

    public void off() {
        System.out.println("关闭了空调...");
    }
}
