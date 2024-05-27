package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: 模板方法模式 测试客户端
 * @date 2024/5/25 18:16
 */

public class Client {
    public static void main(String[] args) {
        CookBaocai cookBaocai = new CookBaocai();
        cookBaocai.cook();

        System.out.println("===========================================");

        CookMeat cookMeat = new CookMeat();
        cookMeat.cook();

    }
}
