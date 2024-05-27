package com.xxliao.pattern.structure.composite.demo;

/**
 * @author xxliao
 * @description: ���ģʽ ���Կͻ���
 * @date 2024/5/25 13:57
 */
public class Client {
    public static void main(String[] args) {
        // ������ѧ
        OrganizationComponent university = new University("xxliao��ѧ", "TOP1");

        // ����ѧԺ
        OrganizationComponent computer = new College("�����ѧԺ", "�����ѧԺ");
        OrganizationComponent finance = new College("���ù���ѧԺ", "����ѧԺ");

        // ��ѧԺ��ӵ���ѧ��
        university.add(computer);
        university.add(finance);

        //����רҵ
        computer.add(new Department("�������ѧ�뼼��","�������ѧ�뼼��"));
        computer.add(new Department("�������","�������"));
        computer.add(new Department("���繤��","���繤��"));

        finance.add(new Department("����ѧ","����ѧ"));
        finance.add(new Department("���ʽ�����ó��","���ʽ�����ó��"));

        // ��ӡ������ѧ�ṹ
        university.print();

    }
}
