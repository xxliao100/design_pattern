package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: 电梯暂停状态 --- 具体状态类
 * @date 2024/5/27 15:58
 */
public class StoppableState extends LiftState{


    @Override
    public void run() {
        System.out.println("运行电梯。。。");
        super.context.setCurrentLiftState(Context.RUNNABLE_STATE);
    }

    @Override
    public void close() {
        System.out.println("关闭电梯。。。");
        super.context.setCurrentLiftState(Context.CLOSEABLE_STATE);
    }
}
