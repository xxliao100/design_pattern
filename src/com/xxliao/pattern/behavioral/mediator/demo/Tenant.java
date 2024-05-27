package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: ����ͬ���� - ������
 * @date 2024/5/26 16:02
 */

public class Tenant extends Person{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @description  ���н�����ϵ�����þ����н��ߵķ���
     * @author  xxliao
     * @date  2024/5/26 16:03
     */
    public void contact(String message) {
        mediator.contact(message,this);
    }

    /**
     * @description  ��ȡ��Ϣ
     * @author  xxliao
     * @date  2024/5/26 16:04
     */
    public void getMessage(String message) {
        System.out.println("�����ˣ�" + name + "��ȡ������Ϣ��" + message);
    }
}
