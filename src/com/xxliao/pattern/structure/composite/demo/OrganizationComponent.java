package com.xxliao.pattern.structure.composite.demo;

/**
 * @author xxliao
 * @description: 组合模式的 抽象根节点
 * @date 2024/5/25 13:42
 */
public abstract class OrganizationComponent {

    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @description  add
     * @author  xxliao
     * @date  2024/5/25 13:45
     */
    public void add(OrganizationComponent organizationComponent) {
        // 抽象根节点不能添加
        throw new UnsupportedOperationException();
    }

    /**
     * @description  delete
     * @author  xxliao
     * @date  2024/5/25 13:45
     */
    public void delete(OrganizationComponent organizationComponent) {
        // 抽象根节点不能添加
        throw new UnsupportedOperationException();
    }

    /**
     * @description  print
     * @author  xxliao
     * @date  2024/5/25 13:46
     */
    public abstract void print();
}
