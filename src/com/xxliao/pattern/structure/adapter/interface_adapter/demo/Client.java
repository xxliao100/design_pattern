package com.xxliao.pattern.structure.adapter.interface_adapter.demo;


/**
 * @author xxliao
 * @description: �ӿ������� ���Կͻ��� ������
 * @date 2024/5/25 0:26
 */
public class Client {

    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void method01() {
                super.method01();
                System.out.println("ִ����method01����..."); // ��������������
            }
        };

        abstractAdapter.method01();
    }
}
