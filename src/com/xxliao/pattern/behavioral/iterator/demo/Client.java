package com.xxliao.pattern.behavioral.iterator.demo;

/**
 * @author xxliao
 * @description: ������ģʽ ���Կͻ���
 * @date 2024/5/26 12:14
 */
public class Client {
    public static void main(String[] args) {
        // ��������������
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        // �����������Ԫ��
        studentAggregate.addStudent(new Student("tom","��","01"));
        studentAggregate.addStudent(new Student("luxy","Ů","02"));
        studentAggregate.addStudent(new Student("leo","��","03"));

        // ��ȡ������
        StudentIterator studentIterator = studentAggregate.getStudentIterator();

        // ����
        while(studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

    }
}
