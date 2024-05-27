package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: �ֻ��� - ���󻯽�ɫ
 * @date 2024/5/25 12:03
 */
public abstract class Phone {

    // ��� Ʒ�� ---- ������Ž�ģʽ�ķ�ʽ����������Ϲ�ϵ
    private Brand brand;

    // ������
    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call() {
        brand.call();
    }
}
