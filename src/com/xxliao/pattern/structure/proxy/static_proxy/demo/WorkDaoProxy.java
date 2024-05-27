package com.xxliao.pattern.structure.proxy.static_proxy.demo;

/**
 * @author xxliao
 * @description: ������
 * @date 2024/5/24 18:35
 */

public class WorkDaoProxy implements IWorkDao {

    // Ŀ�����ͨ���ӿ����ۺ�
    private IWorkDao target;

    // ͨ�������� ���Ŀ�����
    public WorkDaoProxy(IWorkDao target) {
        this.target = target;
    }


    // �����ж�Ŀ������Ŀ�귽������ ��ǿ�ȹ��ܡ�
    @Override
    public void work() {
        System.out.println("before work method ... ");
        target.work();
        System.out.println("after work method ...");
    }
}
