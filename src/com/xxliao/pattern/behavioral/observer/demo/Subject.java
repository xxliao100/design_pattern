package com.xxliao.pattern.behavioral.observer.demo;

/**
 * @author xxliao
 * @description: 抽象主题类
 * @date 2024/5/26 13:05
 */
public interface Subject {

    // 增加订阅者
    public void attach(Observer observer);

    // 删除订阅者
    public void detach(Observer observer);

    // 通知订阅者跟新消息
    public void notify(String message);
}
