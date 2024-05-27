package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: ����ͬ���� -����
 * @date 2024/5/26 15:57
 */

public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @description  ���н�����ϵ,���þ����н��߽�ɫ
     * @author  xxliao
     * @date  2024/5/26 16:00
     */
    public void contact(String message) {
        mediator.contact(message,this);
    }

    /**
     * @description  ��ȡ��Ϣ
     * @author  xxliao
     * @date  2024/5/26 16:01
     */
    public void getMessage(String message) {
        System.out.println("����" + name + "��ȡ������Ϣ��" + message);
    }
}
