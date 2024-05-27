package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: �������� - �����������ͨ���Ƕ������ͨ���������������ִ�������������ֱ�ӷ��ʽ����ߡ�
 * @date 2024/5/25 22:40
 */

public class Waiter {

    // �����������
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * @description  ���
     * @author  xxliao
     * @date  2024/5/25 22:45
     */
    public void takeOrder() {
        // ����Ա�յ��˿ͣ��ͻ��ˣ��������
        System.out.println("����Ա�յ��˿ͣ��ͻ��ˣ��������");
        // ִ�е�Ͳ�����ʹ���������ʵ���Ǿ����������ȥִ�У�Ȼ����õ��ǽ����߶���Chef��ص�ִ�з�����
        command.order();
    }

    /**
     * @description  ȡ�����
     * @author  xxliao
     * @date  2024/5/25 22:46
     */
    public void cancelOrder() {
        // ����Ա�յ��˿ͣ��ͻ��ˣ�ȡ���������
        System.out.println("����Ա�յ��˿ͣ��ͻ��ˣ�ȡ���������");
        // ִ��ȡ����Ͳ�����ʹ���������ʵ���Ǿ����������ȥִ�У�Ȼ����õ��ǽ����߶���Chef��ص�ִ�з�����
        command.cancelOrder();
    }
}
