package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: ��������߽�ɫ -ʧ��
 * @date 2024/5/26 0:22
 */
public class FailActionVisitor extends ActionVisitor{
    @Override
    public void getManResult(Man man) {
        System.out.println("man --- fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("woman --- fail");
    }

}
