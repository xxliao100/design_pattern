package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: 具体访问者角色 -成功
 * @date 2024/5/26 0:22
 */
public class SuccessActionVisitor extends ActionVisitor{
    @Override
    public void getManResult(Man man) {
        System.out.println("man --- success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman --- success");
    }
}
