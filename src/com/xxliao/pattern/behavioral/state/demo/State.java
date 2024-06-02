package com.xxliao.pattern.behavioral.state.demo;

/**
 * @author xxliao
 * @description: ״̬����ӿ� - ����״̬��
 * @date 2024/5/27 15:54
 */

public interface State {

    /**
     * @description  ��������
     * @author  xxliao
     * @date  2024/5/27 15:55
     */
    void open();

    /**
     * @description  ��������
     * @author  xxliao
     * @date  2024/5/27 15:56
     */
    void run();

    /**
     * @description  ������ͣ
     * @author  xxliao
     * @date  2024/5/27 15:56
     */
    void stop();

    /**
     * @description  ֹͣ����
     * @author  xxliao
     * @date  2024/5/27 15:56
     */
    void close();

}
