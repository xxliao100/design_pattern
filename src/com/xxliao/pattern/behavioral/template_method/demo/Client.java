package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: ģ�巽��ģʽ ���Կͻ���
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
