package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: 环境角色
 * @date 2024/5/27 16:27
 */
public class Context {

    // 定义所有状态
    public final static CloseableState CLOSEABLE_STATE = new CloseableState();
    public final static RunnableState RUNNABLE_STATE = new RunnableState();
    public final static StoppableState STOPPABLE_STATE = new StoppableState();

    private LiftState currentLiftState;

    public LiftState getCurrentLiftState() {
        return currentLiftState;
    }

    public void setCurrentLiftState(LiftState currentLiftState) {
        this.currentLiftState = currentLiftState;
        // 跟新环境对象
        this.currentLiftState.setContext(this);
    }

    public void open() {
        this.currentLiftState.open();
    }

    public void run() {
        this.currentLiftState.run();
    }

    public void stop() {
        this.currentLiftState.stop();
    }

    public void close() {
        this.currentLiftState.close();
    }

}
