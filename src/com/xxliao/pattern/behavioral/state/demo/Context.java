package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: ������ɫ
 * @date 2024/5/27 16:27
 */
public class Context {

    // ��������״̬
    public final static CloseableState CLOSEABLE_STATE = new CloseableState();
    public final static RunnableState RUNNABLE_STATE = new RunnableState();
    public final static StoppableState STOPPABLE_STATE = new StoppableState();

    private LiftState currentLiftState;

    public LiftState getCurrentLiftState() {
        return currentLiftState;
    }

    public void setCurrentLiftState(LiftState currentLiftState) {
        this.currentLiftState = currentLiftState;
        // ���»�������
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
