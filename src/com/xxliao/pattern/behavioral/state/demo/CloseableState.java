package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: 电梯关闭状态 -具体状态类
 * @date 2024/5/27 15:58
 */
public class CloseableState extends LiftState{


    @Override
    public void open() {
        System.out.println("开启电梯。。。");
        super.context.setCurrentLiftState(Context.STOPPABLE_STATE);

    }

}
