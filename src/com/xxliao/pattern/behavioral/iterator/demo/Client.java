package com.xxliao.pattern.behavioral.iterator.demo;

/**
 * @author xxliao
 * @description: 迭代器模式 测试客户端
 * @date 2024/5/26 12:14
 */
public class Client {
    public static void main(String[] args) {
        // 创建具体容器类
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        // 向容器中添加元素
        studentAggregate.addStudent(new Student("tom","男","01"));
        studentAggregate.addStudent(new Student("luxy","女","02"));
        studentAggregate.addStudent(new Student("leo","男","03"));

        // 获取迭代器
        StudentIterator studentIterator = studentAggregate.getStudentIterator();

        // 遍历
        while(studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

    }
}
