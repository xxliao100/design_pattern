package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: UpRightPhone
 * @date 2024/5/25 12:12
 */
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void call() {
        super.call();
        System.out.println("UpRightPhone");
    }
}
