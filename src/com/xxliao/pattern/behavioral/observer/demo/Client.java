package com.xxliao.pattern.behavioral.observer.demo;

/**
 * @author xxliao
 * @description: �۲���ģʽ ���Կͻ���
 * @date 2024/5/26 13:14
 */
public class Client {

    public static void main(String[] args) {
        // ��������������
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        // ��ӹ۲��߶���
        subscriptionSubject.attach(new WechatObserver("zhangshan"));
        subscriptionSubject.attach(new WechatObserver("lisi"));
        subscriptionSubject.attach(new WechatObserver("wangwu"));

        // ����Ϣ�������û����۲��߶���
        subscriptionSubject.notify("�Է���");
    }
}
