package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: 具体中介者角色
 * @date 2024/5/26 16:07
 */
public class MediatorStructure extends Mediator{

    // 聚合 中介者必须知道 房主 和租房者 的信息
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
            // 如果是房主，则将消息传递给承租人
            tenant.getMessage(message);
        }else {
            // 如果是租房者，则将消息传递给房主
            houseOwner.getMessage(message);
        }
    }
}
