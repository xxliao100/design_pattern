package com.xxliao.pattern.behavioral.iterator.demo;

/**
 * @author xxliao
 * @description: 定义抽象容器类，包括添加元素、删除元素、获取迭代器对象等方法
 * @date 2024/5/26 12:09
 */
public interface StudentAggregate {

    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
