package com.xxliao.pattern.behavioral.memento.demo;

/**
 * @author xxliao
 * @description: ����¼��ɫ
 * @date 2024/5/26 22:16
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
