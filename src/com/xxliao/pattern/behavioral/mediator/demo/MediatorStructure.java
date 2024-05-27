package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: �����н��߽�ɫ
 * @date 2024/5/26 16:07
 */
public class MediatorStructure extends Mediator{

    // �ۺ� �н��߱���֪�� ���� ���ⷿ�� ����Ϣ
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if(person instanceof HouseOwner) {
            // ����Ƿ���������Ϣ���ݸ�������
            tenant.getMessage(message);
        }else {
            // ������ⷿ�ߣ�����Ϣ���ݸ�����
            houseOwner.getMessage(message);
        }
    }
}
