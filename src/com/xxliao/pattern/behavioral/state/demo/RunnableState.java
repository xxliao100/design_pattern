package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: ��������״̬ -- ����״̬��
 * @date 2024/5/27 15:58
 */
public class RunnableState extends LiftState{


    @Override
    public void stop() {
        System.out.println("ֹͣ���ݡ�����");
        super.context.setCurrentLiftState(Context.STOPPABLE_STATE);
    }


}
