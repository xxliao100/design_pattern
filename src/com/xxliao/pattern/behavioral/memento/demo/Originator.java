package com.xxliao.pattern.behavioral.memento.demo;

/**
 * @author xxliao
 * @description: 发起者角色
 * @date 2024/5/26 22:15
 */

public class Originator {

    private String state; // 状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @description  保存状态到 备忘录角色
     * @author  xxliao
     * @date  2024/5/26 22:18
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * @description  通过备忘录对象，恢复状态
     * @author  xxliao
     * @date  2024/5/26 22:19
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
