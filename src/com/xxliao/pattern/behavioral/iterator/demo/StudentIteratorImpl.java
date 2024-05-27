package com.xxliao.pattern.behavioral.iterator.demo;

import java.util.List;

/**
 * @author xxliao
 * @description: 具体抽象类 重写抽象类所有方法
 * @date 2024/5/26 12:05
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;

    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
