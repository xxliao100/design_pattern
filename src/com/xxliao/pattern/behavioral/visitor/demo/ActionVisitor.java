package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: 抽象访问者角色,角色内定义访问方法，一般来说要包括所有的具体抽象元素
 * @date 2024/5/26 0:18
 */
public abstract class ActionVisitor {

    /**
     * @description  Man get result
     * @author  xxliao
     * @date  2024/5/26 0:20
     */
    public abstract void getManResult(Man man);

    /**
     * @description  Woman get result
     * @author  xxliao
     * @date  2024/5/26 0:20
     */
    public abstract void getWomanResult(Woman woman);

}
