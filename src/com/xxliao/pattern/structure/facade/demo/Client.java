package com.xxliao.pattern.structure.facade.demo;

/**
 * @author xxliao
 * @description: ���ģʽ ���Կͻ���
 * @date 2024/5/25 15:04
 */

public class Client {

    public static void main(String[] args) {
        ApplicationFacade applicationFacade = new ApplicationFacade();
        applicationFacade.say("��");
        applicationFacade.say("�ر�");
    }
}
