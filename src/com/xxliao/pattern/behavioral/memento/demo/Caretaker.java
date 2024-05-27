package com.xxliao.pattern.behavioral.memento.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxliao
 * @description: 管理者角色
 * @date 2024/5/26 22:21
 */
public class Caretaker {

    // create memento list
    private List<Memento> list = new ArrayList<Memento>();

    public void add(Memento memento) {
        list.add(memento);
    }

    public Memento get(int index) {
        return list.get(index);
    }
}
