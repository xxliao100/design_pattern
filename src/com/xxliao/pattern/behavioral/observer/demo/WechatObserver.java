package com.xxliao.pattern.behavioral.observer.demo;

/**
 * @author xxliao
 * @description: Wechat 具体观察者
 * @date 2024/5/26 13:00
 */

public class WechatObserver implements Observer {

    // 微信用户名
    private String username;

    public WechatObserver(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println("====" + username + "====" + message + "====");
    }
}
