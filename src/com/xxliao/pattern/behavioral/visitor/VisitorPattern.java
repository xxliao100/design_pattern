package com.xxliao.pattern.behavioral.visitor;

/**
 * @author xxliao
 * @description: 设计模式 - 行为型模式 - 访问者模式
 *
 * 定义：封装一些作用于某种数据结构中的元素的操作，它可以在不改变这个数据结构（男人和女人）的前提下 定义作用于这些原则新的操作（成功、失败、待定）
 *
 * 结构：
 * 1.抽象访问者角色（Visitor）：定义了对每一个原色（Element）访问的行为，他的参数就是可以访问的元素，他的方法个数理论上和元素个数是一致的，
 *   所以访问者模式要求元素类的个数不能改变。
 * 2.具体访问者角色（Concrete Visitor）：给出对每一个元素访问时所产生的具体行为（demo中的成功、失败、待定）
 * 3.抽象元素角色（Element）：定义了一个接受访问者的方法（accept）,其意思就是每一个元素都可以被访问者访问。
 * 4.具体元素就角色（Concrete Element）:提供了接受访问方法的具体实现，这个具体实现，通常情况下是使用访问者提供的访问该元素的方法。
 * 5.对象结构角色（Object Structure）：可以理解为具体元素的存储容器。
 *
 * 分派：
 * 静态分派：就是程序编译的时候，根据参数类型就可以确定的分派，
 * 动态分派：因为参数是父类或者接口，具体由谁执行需要根据接口传入参数具体类型确定的分派
 *
 * 双重分派：就是尽力两次上面的分派过程就是双分派。
 *
 *
 * 优点：
 *  1.在元素个数不变的情况下，增加新功能（具体访问者对象），做到了开闭原则。
 * 缺点：
 *  1.在元素个数要变化的情况下，所有的具体访问者对象都要修改代码， 不符合开闭原则
 *
 *  使用场景：
 *  1.对象结构相对稳定，但是操作算法经常变化的程序。
 *  2.对象结构中的对象需要提供多种不同且不相关的操作时候
 *
 * @date 2024/5/25 23:11
 */

public class VisitorPattern {
}
