package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: 调用者类 - 持有命令对象，通常是多个，并通过访问命令对象来执行相关请求，他不直接访问接收者。
 * @date 2024/5/25 22:40
 */

public class Waiter {

    // 持有命令对象
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * @description  点餐
     * @author  xxliao
     * @date  2024/5/25 22:45
     */
    public void takeOrder() {
        // 服务员收到顾客（客户端）点餐请求
        System.out.println("服务员收到顾客（客户端）点餐请求");
        // 执行点餐操作，使用命令对象，实际是具体命令对象去执行，然后调用的是接收者对象Chef相关的执行方法。
        command.order();
    }

    /**
     * @description  取消点餐
     * @author  xxliao
     * @date  2024/5/25 22:46
     */
    public void cancelOrder() {
        // 服务员收到顾客（客户端）取消点餐请求
        System.out.println("服务员收到顾客（客户端）取消点餐请求");
        // 执行取消点餐操作，使用命令对象，实际是具体命令对象去执行，然后调用的是接收者对象Chef相关的执行方法。
        command.cancelOrder();
    }
}
