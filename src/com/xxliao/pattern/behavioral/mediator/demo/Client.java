package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: 中介者模式 测试客户端
 * @date 2024/5/26 16:12
 */

public class Client {
    public static void main(String[] args) {
        // 创建中介者机构
        MediatorStructure mediator = new MediatorStructure();

        // 创建房主 并添加到中介机构
        HouseOwner houseOwner = new HouseOwner("房主", mediator);
        mediator.setHouseOwner(houseOwner);

        // 创建承租人，并添加到中介机构
        Tenant tenant = new Tenant("承租人", mediator);
        mediator.setTenant(tenant);

        // 消息传递
        tenant.contact("我想租一个房子");
        houseOwner.contact("我这里有一个，你可以来看看");

    }
}
