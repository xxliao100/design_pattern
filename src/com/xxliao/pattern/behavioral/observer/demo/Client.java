package com.xxliao.pattern.behavioral.observer.demo;

/**
 * @author xxliao
 * @description: 观察者模式 测试客户端
 * @date 2024/5/26 13:14
 */
public class Client {

    public static void main(String[] args) {
        // 创建具体主题类
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        // 添加观察者对象
        subscriptionSubject.attach(new WechatObserver("zhangshan"));
        subscriptionSubject.attach(new WechatObserver("lisi"));
        subscriptionSubject.attach(new WechatObserver("wangwu"));

        // 发消息给订阅用户（观察者对象）
        subscriptionSubject.notify("吃饭了");
    }
}
