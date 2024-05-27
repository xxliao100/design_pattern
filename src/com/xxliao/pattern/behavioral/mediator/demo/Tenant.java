package com.xxliao.pattern.behavioral.mediator.demo;

/**
 * @author xxliao
 * @description: 具体同事类 - 承租人
 * @date 2024/5/26 16:02
 */

public class Tenant extends Person{

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @description  与中介者联系，调用具体中介者的方法
     * @author  xxliao
     * @date  2024/5/26 16:03
     */
    public void contact(String message) {
        mediator.contact(message,this);
    }

    /**
     * @description  获取信息
     * @author  xxliao
     * @date  2024/5/26 16:04
     */
    public void getMessage(String message) {
        System.out.println("承租人：" + name + "获取到的信息：" + message);
    }
}
