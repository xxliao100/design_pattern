package com.xxliao.pattern.behavioral.memento.demo;

/**
 * @author xxliao
 * @description: 备忘录模式 测试客户端
 * @date 2024/5/26 22:23
 */
public class Client {

    public static void main(String[] args) {
        // 创建发起者对象
        Originator originator = new Originator();
        // 创建管理者对象
        Caretaker caretaker = new Caretaker();

        // 发起者-状态1
        originator.setState("状态#1 血量100");
        // 保存当前状态到 备忘录对象中
        caretaker.add(originator.saveStateToMemento());

        // 发起者-状态2
        originator.setState("状态#2 血量88");
        // 保存当前状态到 备忘录对象中
        caretaker.add(originator.saveStateToMemento());

        // 发起者-状态3
        originator.setState("状态#3 血量40");
        // 保存当前状态到 备忘录对象中
        caretaker.add(originator.saveStateToMemento());

        System.out.println("================当前的状态是：" + originator.getState()+"===============");
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("================当前的状态是：" + originator.getState()+"===============");
    }
}
