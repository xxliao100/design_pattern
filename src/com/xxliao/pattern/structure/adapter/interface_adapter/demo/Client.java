package com.xxliao.pattern.structure.adapter.interface_adapter.demo;


/**
 * @author xxliao
 * @description: 接口适配器 测试客户端 测试类
 * @date 2024/5/25 0:26
 */
public class Client {

    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void method01() {
                super.method01();
                System.out.println("执行了method01方法..."); // 抽象适配器子类
            }
        };

        abstractAdapter.method01();
    }
}
