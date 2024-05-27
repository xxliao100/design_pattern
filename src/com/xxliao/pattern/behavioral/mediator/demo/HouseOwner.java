package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: 具体同事类 -房主
 * @date 2024/5/26 15:57
 */

public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @description  与中介者联系,调用具体中介者角色
     * @author  xxliao
     * @date  2024/5/26 16:00
     */
    public void contact(String message) {
        mediator.contact(message,this);
    }

    /**
     * @description  获取信息
     * @author  xxliao
     * @date  2024/5/26 16:01
     */
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息：" + message);
    }
}
