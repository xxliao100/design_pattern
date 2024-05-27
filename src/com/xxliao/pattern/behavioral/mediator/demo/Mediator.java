package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: 抽象中介者角色
 * @date 2024/5/26 15:51
 */

public abstract class Mediator {

    // 申明一个联络方法
    public abstract void contact(String message,Person person);
}
