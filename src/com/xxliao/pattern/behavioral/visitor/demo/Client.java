package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: ������ģʽ ���ƿͻ���
 * @date 2024/5/26 0:36
 */
public class Client {
    public static void main(String[] args) {
        // ���� ����ṹ
        ObjectStructure objectStructure = new ObjectStructure();
        // ��Ӿ���Ԫ�ض���
        objectStructure.addPerson(new Man());
        objectStructure.addPerson(new Woman());

        // ���������߾������ --�ɹ�
        SuccessActionVisitor successActionVisitor = new SuccessActionVisitor();
        // ����ṹ ��ʾ�����
        objectStructure.print(successActionVisitor);
    }
}
