package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: ������
 * @date 2024/5/25 18:12
 */

public class CookMeat extends CookAbstractCalss{

    @Override
    public void addVegetable() {
        System.out.println("�����");
    }

    @Override
    public void addSauce() {}

}
