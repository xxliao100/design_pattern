package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: ����Ԫ�ؽ�ɫ �ṩһ�������÷����߿��Է���
 * @date 2024/5/26 0:18
 */

public abstract class Person {

    /**
     * @description  �ṩ�������߷��ʵķ�������������ͨ���������ݽ�����
     * @author  xxliao
     * @date  2024/5/26 0:28
     */
    public abstract void result(ActionVisitor actionVisitor);
}
