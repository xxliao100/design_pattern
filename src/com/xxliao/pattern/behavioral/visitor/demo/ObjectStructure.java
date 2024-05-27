package com.xxliao.pattern.behavioral.visitor.demo;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xxliao
 * @description: ����ṹ����Ҫ����洢����Ԫ�ؽ�ɫ��������Ȼ��
 * @date 2024/5/26 0:24
 */

public class ObjectStructure {

    // ����洢����Ԫ�ض��������
    private List<Person>  persons = new LinkedList<>();

    // ��Ӿ���Ԫ�ض���
    public void addPerson(Person person) {
        persons.add(person);
    }

    // �Ƴ�����Ԫ�ض���
    public void removePerson(Person person) {
        persons.remove(person);
    }

    /**
     * @description  ��ʾ�����
     * @author  xxliao
     * @date  2024/5/26 0:35
     */
    public void print(ActionVisitor actionVisitor){
        for (Person person : persons) {
            person.result(actionVisitor);
        }
    }
}
