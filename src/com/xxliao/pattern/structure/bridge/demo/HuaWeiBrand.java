package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: HuaWei Brand - 具体实现化角色
 * @date 2024/5/25 12:07
 */

public class HuaWeiBrand implements Brand {

    @Override
    public void call() {
        System.out.println("HuaWei call...");
    }
}
