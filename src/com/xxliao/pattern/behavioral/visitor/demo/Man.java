package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: ����Ԫ�ؽ�ɫ������һ�������߷���
 * @date 2024/5/26 0:18
 */
public class Man extends Person{


    /**
     * @description  ����Ԫ�ؽ�ɫ�ṩ�������ߵķ�������������ͨ���������ݽ���
     * @author  xxliao
     * @date  2024/5/26 0:29
     */
    @Override
    public void result(ActionVisitor actionVisitor) {
        // �����߶��� ��ȡ ��Ԫ�أ�man������Ľ��,���������Լ����ݽ�ȥ������ʹ����˫����
        actionVisitor.getManResult(this);
    }
}
