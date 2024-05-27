package com.xxliao.pattern.structure.decorator;

/**
 * @author xxliao
 * @description: 设计模式-结构型模式-装饰者模式
 *
 * 定义：装饰者模式是 动态的将新对象依附到对象上。相当于对象可以包裹对象本身，然后可以根据 递归方式获取想要的信息
 *
 * 结构：
 * 1.抽象构件角色（component）:定义一个抽象接口以规范准备接受附加责任的对象。
 * 2.具体构件角色（concrete component）:实现抽象构件，通过装饰角色为其添加一些职责。
 * 3.抽象装饰角色（decorator）:继承或实现抽象构建，并包含具体构建的实例，可以通过其子类扩展具体构件的功能。
 * 3.具体装饰角色（concrete decorator）:实现抽象装饰的相关方法，并给具体构建对象添加附加责任。
 *
 * 实际使用： JDK　中的　IO流
 *
 * @date 2024/5/25 12:23
 */
public class DecoratorPattern {
}
