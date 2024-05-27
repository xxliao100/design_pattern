package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: ���崦����
 * @date 2024/5/27 17:38
 */
public class Manager extends Handler{

    public Manager() {
        //���ž�����3-7������
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "���" + leave.getNum() +
                "��," + leave.getContent() + "��");
        System.out.println("���ž���������ͬ�⡣");
    }
}
