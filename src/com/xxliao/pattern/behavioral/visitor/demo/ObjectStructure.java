package com.xxliao.pattern.behavioral.visitor.demo;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xxliao
 * @description: 对象结构，需要定义存储具体元素角色的容器，然后
 * @date 2024/5/26 0:24
 */

public class ObjectStructure {

    // 定义存储具体元素对象的容器
    private List<Person>  persons = new LinkedList<>();

    // 添加具体元素对象
    public void addPerson(Person person) {
        persons.add(person);
    }

    // 移除具体元素对象
    public void removePerson(Person person) {
        persons.remove(person);
    }

    /**
     * @description  显示最后结果
     * @author  xxliao
     * @date  2024/5/26 0:35
     */
    public void print(ActionVisitor actionVisitor){
        for (Person person : persons) {
            person.result(actionVisitor);
        }
    }
}
