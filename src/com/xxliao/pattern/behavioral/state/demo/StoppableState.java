package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: ������ͣ״̬ --- ����״̬��
 * @date 2024/5/27 15:58
 */
public class StoppableState extends LiftState{


    @Override
    public void run() {
        System.out.println("���е��ݡ�����");
        super.context.setCurrentLiftState(Context.RUNNABLE_STATE);
    }

    @Override
    public void close() {
        System.out.println("�رյ��ݡ�����");
        super.context.setCurrentLiftState(Context.CLOSEABLE_STATE);
    }
}
