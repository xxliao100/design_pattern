package com.xxliao.pattern.behavioral.chain_responsibility;

/**
 * @author xxliao
 * @description: 设计模式 - 行为型模式 - 责任链模式
 *
 * 定义：为了避免请求发送者与多个请求处理者耦合在一起，将所有请求的处理者，通过前一对象记住其下一个对象的引用，而连成一条链，当有请求发生时候，可将
 * 请求沿着这一条链传递，直到有对象处理它为止。
 *
 * 结构：
 * 1.抽象处理者角色（Abstract Handler）:定义一个处理请求的接口，包含抽象处理方法和一个后续链接。
 * 2.具体处理者角色（concrete Handler）:实现抽象处理者角色的处理方法，判断能否处理本次请求，如果可以处理请求则处理，不能就转给它的后续者。
 * 3.客户类角色（Client）：创建处理类，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
 *
 * @date 2024/5/27 17:16
 */

public class ChainResponsibilityPattern {
}
