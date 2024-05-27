package com.xxliao.pattern.structure.flyweight;

/**
 * @author xxliao
 * @description: 设计模式-结构型模式-享元模式
 *
 * 定义：享元模式主要是通过 共享对象 来减少系统中对象的数量，其本质就是缓存共享对象，降低内存消耗。
 *
 * 享元模式将需要重复使用的对象分为两个状态：内部状态 和 外部状态，内部状态是不会变化的，可以被多个对象共享，而外部状态会随着对象的使用而改变。
 *
 * 结构：
 * 1.抽象享元角色（FlyWeight）:享元对象抽象基类或者接口，同事定义出对象的外部状态 和 内部状态 的接口或实现；
 * 2.具体享元角色（Concrete FlyWeight）:实现抽象享元类中的方法，是需要共享的对象类。
 * 3.享元工厂（FlyWeight Factory）:维护一个享元对象的池，内部使用容器存储已经创建的享元对象。
 *
 *
 * 实际中的使用：jdk-Interger(-128 127),存在于缓存池
 *
 * @date 2024/5/25 15:47
 */

public class FlyWeightPattern {
}
