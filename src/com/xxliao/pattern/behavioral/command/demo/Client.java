package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: ����ģʽ ���Կͻ���
 * @date 2024/5/25 22:47
 */
public class Client {
    public static void main(String[] args) {
        // ���������߶��� -- ��ʦ����
        Chef chef = new Chef();
        // ��������������� Ȼ�󽫽����߶��� �������� ����
        Command orderCommand = new OrderCommand(chef);
        // ���������߶��� -- ����Ա
        Waiter waiter = new Waiter();
        // ������������� ���� �����߶���
        waiter.setCommand(orderCommand);

        // ִ����ز���
        waiter.takeOrder();

        waiter.cancelOrder();

    }
}
