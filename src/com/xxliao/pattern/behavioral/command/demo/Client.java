package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: 命令模式 测试客户端
 * @date 2024/5/25 22:47
 */
public class Client {
    public static void main(String[] args) {
        // 创建接收者对象 -- 厨师对象
        Chef chef = new Chef();
        // 创建具体命令对象， 然后将接收者对象 当作参数 传入
        Command orderCommand = new OrderCommand(chef);
        // 创建调用者对象 -- 服务员
        Waiter waiter = new Waiter();
        // 将具体命令对象 传入 调用者对象
        waiter.setCommand(orderCommand);

        // 执行相关操作
        waiter.takeOrder();

        waiter.cancelOrder();

    }
}
