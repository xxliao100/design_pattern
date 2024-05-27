package com.xxliao.pattern.behavioral.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxliao
 * @description: 具体主题类
 * @date 2024/5/26 13:11
 */
public class SubscriptionSubject implements Subject{

    // 定义存储观察者容器
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
