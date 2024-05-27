package com.xxliao.pattern.structure.bridge;

/**
 * @author xxliao
 * @description: 设计模式-结构型模式-桥接模式
 *
 * 定义：桥接模式是将 抽象 与 实现  分离，使它们独立变化。然后利用 组合关系 来代替 继承关系，大大的降低了 抽象 和 实现 的耦合度。
 *
 * 结构：
 * 1.抽象化角色（Abstraction）:定义抽象类，并包含一个对实现化的引用。
 * 2.扩展抽象化角色（Refined Abstraction）：抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用 实现化角色 的业务方法
 * 3.实现化角色（Implementor）:定义实现角色的接口，供扩展抽象化角色调用。
 * 4.具体实现化（Concrete Implementor）:给出实现化接口的具体实现。
 *
 * 优点：
 * 1.实现了抽象和实现 部分的分离，提高了系统的灵活性，有助于系统进行分层设计。
 * 2.桥接模式 替代多层继承方案，可以减少子类的个数，降低系统的管理和维护成本。
 *
 * 实际使用： JDBC源码分析，定义了Driver接口，然后各个数据库厂商去实现Driver接口，
 *
 * @date 2024/5/25 11:39
 */

public class BridgePattern {
}
