package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: 具体处理类
 * @date 2024/5/27 17:38
 */
public class Manager extends Handler{

    public Manager() {
        //部门经理处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() +
                "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
