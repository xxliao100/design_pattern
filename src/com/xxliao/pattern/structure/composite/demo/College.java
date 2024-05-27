package com.xxliao.pattern.structure.composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxliao
 * @description: Composite �� ��ѧԺ�� ���Թ��� Department��
 * @date 2024/5/25 13:48
 */
public class College extends OrganizationComponent{

    // �ӽڵ㼯�� ��������Ϲ�ϵ ������ OrganizationComponent������ڵ�
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
