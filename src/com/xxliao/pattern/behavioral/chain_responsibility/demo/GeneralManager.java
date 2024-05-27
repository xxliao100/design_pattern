package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: 具体处理类 - 总经理
 * @date 2024/5/27 17:39
 */

public class GeneralManager extends Handler{
    public GeneralManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }
    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() +
                "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
