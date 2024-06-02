package com.xxliao.pattern.structure.adapter.object_adapter.demo;

import com.xxliao.pattern.structure.adapter.class_adapter.demo.Voltage220V;

/**
 * @author xxliao
 * @description: ���������� ���Կͻ��� ������
 * @date 2024/5/25 0:06
 */
public class Client {
    public static void main(String[] args) {
        Voltage220V voltage220V = new Voltage220V();
        Adapter adapter = new Adapter(voltage220V);
        adapter.output5V();
    }
}
