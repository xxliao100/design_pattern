package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: ����Ԫ�ؽ�ɫ
 * @date 2024/5/26 0:19
 */
public class Woman extends Person{

    /**
     * @description  ����Ԫ�ؽ�ɫ�ṩ�������ߵķ�������������ͨ���������ݽ���
     * @author  xxliao
     * @date  2024/5/26 0:29
     */
    @Override
    public void result(ActionVisitor actionVisitor) {
        // �����߶��� ��ȡ ��Ԫ�أ�woman������Ľ��,���������Լ����ݽ�ȥ������ʹ����˫����
        actionVisitor.getWomanResult(this);
    }
}
