package com.xxliao.pattern.creational.builder.expansion;

/**
 * @author xxliao
 * @description: 建造者模式 扩展测试类
 * @date 2024/5/24 17:51
 */

public class Client {

    public static void main(String[] args) {
        AppendBuilder appendBuilder = new AppendBuilder.Builder()
                .name("name")
                .sex("男")
                .idCard("500234")
                .address("重庆市")
                .build();
        System.out.println(appendBuilder);
    }
}
