package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: ����������ӿڣ�������ִ�в�����ͳһ����
 * @date 2024/5/25 19:26
 */
public interface Command {

    // ���
    void order();
    // ȡ�����
    void cancelOrder();
}
