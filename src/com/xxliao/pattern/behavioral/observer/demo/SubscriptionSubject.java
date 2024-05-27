package com.xxliao.pattern.behavioral.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxliao
 * @description: ����������
 * @date 2024/5/26 13:11
 */
public class SubscriptionSubject implements Subject{

    // ����洢�۲�������
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
