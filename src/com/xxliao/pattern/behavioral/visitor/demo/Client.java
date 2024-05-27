package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: 访问者模式 测似客户端
 * @date 2024/5/26 0:36
 */
public class Client {
    public static void main(String[] args) {
        // 创建 对象结构
        ObjectStructure objectStructure = new ObjectStructure();
        // 添加具体元素对象
        objectStructure.addPerson(new Man());
        objectStructure.addPerson(new Woman());

        // 创建访问者具体对象 --成功
        SuccessActionVisitor successActionVisitor = new SuccessActionVisitor();
        // 对象结构 显示最后结果
        objectStructure.print(successActionVisitor);
    }
}
