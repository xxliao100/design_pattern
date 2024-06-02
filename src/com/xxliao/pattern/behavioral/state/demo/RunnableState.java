package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: 电梯运行状态 -- 具体状态类
 * @date 2024/5/27 15:58
 */
public class RunnableState extends LiftState{


    @Override
    public void stop() {
        System.out.println("停止电梯。。。");
        super.context.setCurrentLiftState(Context.STOPPABLE_STATE);
    }


}
