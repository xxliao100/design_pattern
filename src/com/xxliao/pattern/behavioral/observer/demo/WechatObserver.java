package com.xxliao.pattern.behavioral.observer.demo;

/**
 * @author xxliao
 * @description: Wechat ����۲���
 * @date 2024/5/26 13:00
 */

public class WechatObserver implements Observer {

    // ΢���û���
    private String username;

    public WechatObserver(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println("====" + username + "====" + message + "====");
    }
}
