package com.xxliao.pattern.behavioral.command;

/**
 * @author xxliao
 * @description: 设计模式-行为型模式-命令模式
 *
 * 定义：命令模式也叫动作模式或者事务模式。它是将请求（命令）封装成对象，使得可以用不同的请求对客户端进行参数化，具体的请求可以在运行时更改、排队和记录，
 * 它将 发出者 和 接收者 解耦，顺序是： 发出者 --> 命令 --> 接收者
 *
 * 结构：
 * 1.抽象命令（Abstract Command）: 抽象命令是一个接口，定义了执行操作的统一方法。具体的命令类会实现这个接口，并提供执行相应操作的具体逻辑
 * 2.具体命令（Concrete Command）：具体命令类实现了抽象命令类，它拥有 接收者对象 ，并通过调用接收者的功能来完成命令要执行的操作。
 * 3.接收者（Receiver）: 执行实际命令的类，命令对象会调用接收者的方法来执行请求。
 * 4.调用者（Invoker）：持有命令对象，通常是多个，并通过访问命令对象来执行相关请求，他不直接访问接收者。
 *
 *
 * 实际使用：
 * 1.Spring JdbcTemplate 中的execute/query方法。
 * 2.Runnable Thread start()。
 *
 * @date 2024/5/25 19:17
 */

public class CommandPattern {
}
