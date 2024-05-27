package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: 接收者类，执行实际命令的类，命令对象会调用接收者的方法来执行请求
 * @date 2024/5/25 19:28
 */

public class Chef {

    public void cook() {
        System.out.println("chef process order。。。");
    }

    public void cancelCooking() {
        System.out.println("chef cancel cooking...");
    }
}
