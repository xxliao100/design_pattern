package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: 手机类 - 抽象化角色
 * @date 2024/5/25 12:03
 */
public abstract class Phone {

    // 组合 品牌 ---- 这就是桥接模式的方式，利用了组合关系
    private Brand brand;

    // 构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        brand.call();
    }
}
