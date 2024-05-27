package com.xxliao.pattern.behavioral.iterator.demo;

/**
 * @author xxliao
 * @description: 抽象迭代器接口，申明hashNext/next方法
 * @date 2024/5/26 12:02
 */
public interface StudentIterator {

    boolean hasNext();

    Student next();
}
