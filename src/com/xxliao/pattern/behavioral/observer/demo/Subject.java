package com.xxliao.pattern.behavioral.observer.demo;

/**
 * @author xxliao
 * @description: ����������
 * @date 2024/5/26 13:05
 */
public interface Subject {

    // ���Ӷ�����
    public void attach(Observer observer);

    // ɾ��������
    public void detach(Observer observer);

    // ֪ͨ�����߸�����Ϣ
    public void notify(String message);
}
