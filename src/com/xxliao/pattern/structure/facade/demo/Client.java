package com.xxliao.pattern.structure.facade.demo;

/**
 * @author xxliao
 * @description: 外观模式 测试客户端
 * @date 2024/5/25 15:04
 */

public class Client {

    public static void main(String[] args) {
        ApplicationFacade applicationFacade = new ApplicationFacade();
        applicationFacade.say("打开");
        applicationFacade.say("关闭");
    }
}
