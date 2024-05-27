package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: TODO
 * @date 2024/5/25 12:13
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new MIBrand());
        phone1.call();
        System.out.println("=========================================================");
        Phone phone2 = new FoldedPhone(new HuaWeiBrand());
        phone2.call();
        System.out.println("=========================================================");

        Phone phone3 = new UpRightPhone(new MIBrand());
        phone3.call();
        System.out.println("=========================================================");
        Phone phone4 = new UpRightPhone(new HuaWeiBrand());
        phone4.call();
        System.out.println("=========================================================");

    }
}
