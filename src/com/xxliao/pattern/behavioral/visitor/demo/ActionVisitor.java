package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: ��������߽�ɫ,��ɫ�ڶ�����ʷ�����һ����˵Ҫ�������еľ������Ԫ��
 * @date 2024/5/26 0:18
 */
public abstract class ActionVisitor {

    /**
     * @description  Man get result
     * @author  xxliao
     * @date  2024/5/26 0:20
     */
    public abstract void getManResult(Man man);

    /**
     * @description  Woman get result
     * @author  xxliao
     * @date  2024/5/26 0:20
     */
    public abstract void getWomanResult(Woman woman);

}
