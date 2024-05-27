package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: FoldedPhone
 * @date 2024/5/25 12:12
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void call() {
        super.call();
        System.out.println("FoldedPhone");
    }
}
