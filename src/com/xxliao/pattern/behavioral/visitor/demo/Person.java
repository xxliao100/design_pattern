package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: 抽象元素角色 提供一个方法让访问者可以访问
 * @date 2024/5/26 0:18
 */

public abstract class Person {

    /**
     * @description  提供给访问者访问的防方法，访问者通过参数传递进来。
     * @author  xxliao
     * @date  2024/5/26 0:28
     */
    public abstract void result(ActionVisitor actionVisitor);
}
