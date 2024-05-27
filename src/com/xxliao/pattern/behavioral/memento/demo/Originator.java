package com.xxliao.pattern.behavioral.memento.demo;

/**
 * @author xxliao
 * @description: �����߽�ɫ
 * @date 2024/5/26 22:15
 */

public class Originator {

    private String state; // ״̬��Ϣ

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @description  ����״̬�� ����¼��ɫ
     * @author  xxliao
     * @date  2024/5/26 22:18
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * @description  ͨ������¼���󣬻ָ�״̬
     * @author  xxliao
     * @date  2024/5/26 22:19
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
