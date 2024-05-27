package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: 具体类
 * @date 2024/5/25 18:12
 */

public class CookMeat extends CookAbstractCalss{

    @Override
    public void addVegetable() {
        System.out.println("添加肉");
    }

    @Override
    public void addSauce() {}

}
