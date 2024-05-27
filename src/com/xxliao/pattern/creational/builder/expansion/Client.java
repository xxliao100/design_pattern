package com.xxliao.pattern.creational.builder.expansion;

/**
 * @author xxliao
 * @description: ������ģʽ ��չ������
 * @date 2024/5/24 17:51
 */

public class Client {

    public static void main(String[] args) {
        AppendBuilder appendBuilder = new AppendBuilder.Builder()
                .name("name")
                .sex("��")
                .idCard("500234")
                .address("������")
                .build();
        System.out.println(appendBuilder);
    }
}
