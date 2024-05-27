package com.xxliao.pattern.behavioral.command.demo;

/**
 * @author xxliao
 * @description: ���������࣬ʵ���˳�������ӿڣ�ͨ����ϣ�ӵ�н����߶��󣬲�ͨ�����ý����߶���ķ������������Ҫִ�еĲ�����
 * @date 2024/5/25 19:30
 */

public class OrderCommand implements Command {

    // �ۺϷ�ʽ ���� �����߶���
    private Chef chef;

    public OrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void order() {
        chef.cook();
    }

    @Override
    public void cancelOrder() {
        chef.cancelCooking();
    }
}
