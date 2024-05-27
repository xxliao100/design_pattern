package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: 抽象命令类接口，定义了执行操作的统一方法
 * @date 2024/5/25 19:26
 */
public interface Command {

    // 点菜
    void order();
    // 取消点菜
    void cancelOrder();
}
