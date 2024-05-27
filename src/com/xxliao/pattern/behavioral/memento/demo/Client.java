package com.xxliao.pattern.behavioral.memento.demo;

/**
 * @author xxliao
 * @description: ����¼ģʽ ���Կͻ���
 * @date 2024/5/26 22:23
 */
public class Client {

    public static void main(String[] args) {
        // ���������߶���
        Originator originator = new Originator();
        // ���������߶���
        Caretaker caretaker = new Caretaker();

        // ������-״̬1
        originator.setState("״̬#1 Ѫ��100");
        // ���浱ǰ״̬�� ����¼������
        caretaker.add(originator.saveStateToMemento());

        // ������-״̬2
        originator.setState("״̬#2 Ѫ��88");
        // ���浱ǰ״̬�� ����¼������
        caretaker.add(originator.saveStateToMemento());

        // ������-״̬3
        originator.setState("״̬#3 Ѫ��40");
        // ���浱ǰ״̬�� ����¼������
        caretaker.add(originator.saveStateToMemento());

        System.out.println("================��ǰ��״̬�ǣ�" + originator.getState()+"===============");
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("================��ǰ��״̬�ǣ�" + originator.getState()+"===============");
    }
}
