package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: ���崦���� -�鳤
 * @date 2024/5/27 17:37
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        //С�鳤����1-3������
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "���" + leave.getNum() +
                "��," + leave.getContent() + "��");
        System.out.println("С�鳤������ͬ�⡣");
    }
}
