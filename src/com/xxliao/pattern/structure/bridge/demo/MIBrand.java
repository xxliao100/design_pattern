package com.xxliao.pattern.structure.bridge.demo;

/**
 * @author xxliao
 * @description: MI Brand - ����ʵ�ֻ���ɫ
 * @date 2024/5/25 12:05
 */
public class MIBrand implements Brand{

    @Override
    public void call() {
        System.out.println("MI call...");
    }
}
