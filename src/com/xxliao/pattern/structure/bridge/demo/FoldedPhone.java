package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: FoldedPhone -- 扩展抽象化角色
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
