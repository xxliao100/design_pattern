package com.xxliao.pattern.behavioral.iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxliao
 * @description: 定义具体容器类，重写所有的方法。
 * @date 2024/5/26 12:11
 */
public class StudentAggregateImpl implements StudentAggregate{

    // 学生列表容器
    private List<Student> list = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(this.list);
    }
}
