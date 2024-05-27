package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: ״̬ģʽ ���Կͻ���
 * @date 2024/5/27 16:38
 */
public class Client {

    public static void main(String[] args) {
        // ����������ɫ
        Context context = new Context();
        // ���õ�ǰ״̬
        context.setCurrentLiftState(Context.CLOSEABLE_STATE);

        // ��������
        context.open();
        // ���е���
        context.run();
        // ֹͣ����
        context.stop();
        // �رյ���
        context.close();
    }
}
