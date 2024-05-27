package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: 具体命令类，实现了抽象命令接口，通过组合，拥有接收者对象，并通过调用接收者对象的方法来完成命令要执行的操作。
 * @date 2024/5/25 19:30
 */

public class OrderCommand implements Command {

    // 聚合方式 持有 接收者对象
    private Chef chef;

    public OrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void order() {
        chef.cook();
    }

    @Override
    public void cancelOrder() {
        chef.cancelCooking();
    }
}
