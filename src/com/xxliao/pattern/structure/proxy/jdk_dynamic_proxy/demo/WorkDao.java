package com.xxliao.pattern.structure.proxy.jdk_dynamic_proxy.demo;

/**
 * @author xxliao
 * @description: ������ʵ����-��ʵ������
 * @date 2024/5/24 18:34
 */

public class WorkDao implements IWorkDao {

    @Override
    public void work() {
        System.out.println("Worker working....");
    }
}
