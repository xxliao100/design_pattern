package com.xxliao.pattern.structure.composite.demo;

/**
 * @author xxliao
 * @description: 组合模式 测试客户端
 * @date 2024/5/25 13:57
 */
public class Client {
    public static void main(String[] args) {
        // 创建大学
        OrganizationComponent university = new University("xxliao大学", "TOP1");

        // 创建学院
        OrganizationComponent computer = new College("计算机学院", "计算机学院");
        OrganizationComponent finance = new College("经济管理学院", "经管学院");

        // 将学院添加到大学中
        university.add(computer);
        university.add(finance);

        //创建专业
        computer.add(new Department("计算机科学与技术","计算机科学与技术"));
        computer.add(new Department("软件工程","软件工程"));
        computer.add(new Department("网络工程","网络工程"));

        finance.add(new Department("经济学","经济学"));
        finance.add(new Department("国际金融与贸易","国际金融与贸易"));

        // 打印整个大学结构
        university.print();

    }
}
