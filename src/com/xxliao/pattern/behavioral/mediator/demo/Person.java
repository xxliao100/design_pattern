package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: 抽象同事类
 * @date 2024/5/26 15:52
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
