package com.xxliao.pattern.structure.composite.demo;

/**
 * @author xxliao
 * @description: leaf �� ���ӽڵ���
 * @date 2024/5/25 13:48
 */
public class Department extends OrganizationComponent{


    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

}
