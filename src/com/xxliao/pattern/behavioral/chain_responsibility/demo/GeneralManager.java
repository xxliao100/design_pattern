package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: ���崦���� - �ܾ���
 * @date 2024/5/27 17:39
 */

public class GeneralManager extends Handler{
    public GeneralManager() {
        //���ž�����7�����ϵ����
        super(Handler.NUM_SEVEN);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "���" + leave.getNum() +
                "��," + leave.getContent() + "��");
        System.out.println("�ܾ���������ͬ�⡣");
    }
}
