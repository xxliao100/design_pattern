package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: 抽象处理类
 * @date 2024/5/27 17:28
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 该处理者可以处理的取件
    private int startNum;
    private int endNum;

    // 上级领导
    private Handler nextHandler;

    // 设置请假天数
    public Handler(int startNum) {
        this.startNum = startNum;
    }

    // 设置请假天数范围
    public Handler(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    // 设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @description  提交请假条
     * @author  xxliao
     * @date  2024/5/27 17:32
     */
    public final void submit(LeaveRequest leave) {
        if(0 == this.startNum) {
            return;
        }

        if(leave.getNum() >= this.startNum) {
            this.handleLeave(leave);
            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if(null != this.nextHandler && leave.getNum() > endNum){
                this.nextHandler.submit(leave);//继续提交
            } else {
                System.out.println("流程结束");
            }
        }
    }

    protected abstract void handleLeave(LeaveRequest leave);
}
