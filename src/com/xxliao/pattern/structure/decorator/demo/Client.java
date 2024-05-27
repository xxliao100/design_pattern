package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: 装饰者模式 测试客户端
 * @date 2024/5/25 12:54
 */
public class Client {
    public static void main(String[] args) {
        // 点一份炒饭
        FastFood friedRice = new FriedRice();

        System.out.println(friedRice.getDesc()+" "+friedRice.cost()+"元");

        // 添加一个鸡蛋
        FastFood eggFriedRice = new Egg(friedRice);
        //
        System.out.println(eggFriedRice.getDesc()+" "+eggFriedRice.cost()+"元");
    }
}
