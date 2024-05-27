package com.xxliao.pattern.structure.facade.demo;

/**
 * @author xxliao
 * @description: 外观角色类
 * @date 2024/5/25 14:59
 */
public class ApplicationFacade {

    private Light light;

    private TV tv;

    private AirCondition airCondition;

    public ApplicationFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    /**
     * @description  一键打开
     * @author  xxliao
     * @date  2024/5/25 15:02
     */
    private void on() {
        System.out.println("on...");
        light.on();
        tv.on();
        airCondition.on();
    }

    /**
     * @description  一键关闭
     * @author  xxliao
     * @date  2024/5/25 15:02
     */
    private void off() {
        System.out.println("off...");
        light.off();
        tv.off();
        airCondition.off();
    }

    /**
     * @description  对外提供统一接口
     * @author  xxliao
     * @date  2024/5/25 15:03
     */
    public void say(String message) {
        if("打开".equals(message)){
            on();
        }else if("关闭".equals(message)) {
            off();
        }
    }
}
