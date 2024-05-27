package com.xxliao.pattern.structure.composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxliao
 * @description: Composite 类 ，学院类 可以管理 Department类
 * @date 2024/5/25 13:48
 */
public class College extends OrganizationComponent{

    // 子节点集合 ，采用组合关系 集成了 OrganizationComponent抽象根节点
    private List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String desc) {
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
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void delete(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public void print() {
        System.out.println("=================="+getName()+"=================");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
