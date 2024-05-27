package com.xxliao.pattern.behavioral.iterator.demo;

/**
 * @author xxliao
 * @description: ������������࣬�������Ԫ�ء�ɾ��Ԫ�ء���ȡ����������ȷ���
 * @date 2024/5/26 12:09
 */
public interface StudentAggregate {

    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
