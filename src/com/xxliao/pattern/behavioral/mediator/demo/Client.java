package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: �н���ģʽ ���Կͻ���
 * @date 2024/5/26 16:12
 */

public class Client {
    public static void main(String[] args) {
        // �����н��߻���
        MediatorStructure mediator = new MediatorStructure();

        // �������� ����ӵ��н����
        HouseOwner houseOwner = new HouseOwner("����", mediator);
        mediator.setHouseOwner(houseOwner);

        // ���������ˣ�����ӵ��н����
        Tenant tenant = new Tenant("������", mediator);
        mediator.setTenant(tenant);

        // ��Ϣ����
        tenant.contact("������һ������");
        houseOwner.contact("��������һ���������������");

    }
}
