package com.xxliao.pattern.behavioral.iterator;

/**
 * @author xxliao
 * @description: 设计模式-行为型模式-迭代器模式
 *
 * 定义：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部
 *
 * 结构：
 * 1.抽象聚合角色（Aggregate）：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
 * 2.具体聚合角色（concrete Aggregate）:实现抽象聚合类，返回一个具体迭代器的实例。
 * 3.抽象迭代器角色（Iterator）：定义访问和遍历聚合元素的接口，通常包含hasNext()、next()等方法
 * 4.具体迭代器角色（Concrete Iterator）:实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 *
 * @date 2024/5/26 10:27
 */

public class IteratorPattern {

}
