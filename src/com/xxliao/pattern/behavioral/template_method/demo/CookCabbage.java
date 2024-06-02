package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: 具体类
 * @date 2024/5/25 18:12
 */

public class CookCabbage extends CookAbstractCalss{

    @Override
    public void addVegetable() {
        System.out.println("添加包菜");
    }

    @Override
    public void addSauce() {}

    /**
     * @description  重写钩子方法
     * @author  xxliao
     * @date  2024/5/25 18:13
     */
    @Override
    public boolean isAddOil() {
        return false;
    }
}
