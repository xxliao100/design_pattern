package com.xxliao.pattern.structure.facade.demo;

/**
 * @author xxliao
 * @description: ��۽�ɫ��
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
     * @description  һ����
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
     * @description  һ���ر�
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
     * @description  �����ṩͳһ�ӿ�
     * @author  xxliao
     * @date  2024/5/25 15:03
     */
    public void say(String message) {
        if("��".equals(message)){
            on();
        }else if("�ر�".equals(message)) {
            off();
        }
    }
}
