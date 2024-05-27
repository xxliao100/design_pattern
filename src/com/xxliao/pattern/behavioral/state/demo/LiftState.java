package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: 抽象状态类 - 电梯状态
 * @date 2024/5/27 15:53
 */

public abstract class LiftState implements State{

    protected static final RuntimeException EXCEPTION = new RuntimeException("无法操作...");

    // 定义环境角色
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void open() {
        throw EXCEPTION;
    }

    @Override
    public void run() {
        throw EXCEPTION;
    }

    @Override
    public void stop() {
        throw EXCEPTION;
    }

    @Override
    public void close() {
        throw EXCEPTION;
    }
}
