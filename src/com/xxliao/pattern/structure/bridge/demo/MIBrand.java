package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: MI Brand - 具体实现化角色
 * @date 2024/5/25 12:05
 */
public class MIBrand implements Brand{

    @Override
    public void call() {
        System.out.println("MI call...");
    }
}
