package com.xxliao.pattern.structure.composite;

/**
 * @author xxliao
 * @description: 设计模式-结构型模式-组合模式
 *
 * 定义：组合模式又叫整体模式，它创建了对象组的树形结构，将对象组合成树状结构来表示“整体-部分”的层次关系
 *
 * 结构：
 * 1.Component：抽象根节点，定义系统各层次对象的共有方法和属性，用于访问和管理Component子部件，Component可以是抽象类或者接口。
 * 2.Composite:非叶子节点，用来存储子部件，实现了Component结构，并用 组合 关系 组合Component对象，一般用来增加（add）、删除（delete）
 * 3.Leaf：叶子节点，叶子节点没有子节点
 *
 * 实际使用点：
 * 1.HashMap中构造函数，有可以添加整个集合的构造，就是组合模式
 *
 * @date 2024/5/25 13:36
 */

public class CompositePattern {
}
