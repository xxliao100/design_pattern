package com.xxliao.pattern.behavioral.chain_responsibility.demo;

/**
 * @author xxliao
 * @description: �����ʵ��
 * @date 2024/5/27 17:26
 */

public class LeaveRequest {

    private String name;//����

    private int num;//�������

    private String content;//�������

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
