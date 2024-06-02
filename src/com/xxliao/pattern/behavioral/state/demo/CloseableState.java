package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: ���ݹر�״̬ -����״̬��
 * @date 2024/5/27 15:58
 */
public class CloseableState extends LiftState{


    @Override
    public void open() {
        System.out.println("�������ݡ�����");
        super.context.setCurrentLiftState(Context.STOPPABLE_STATE);

    }

}
