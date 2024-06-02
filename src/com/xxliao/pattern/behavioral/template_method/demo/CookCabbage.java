package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: ������
 * @date 2024/5/25 18:12
 */

public class CookCabbage extends CookAbstractCalss{

    @Override
    public void addVegetable() {
        System.out.println("��Ӱ���");
    }

    @Override
    public void addSauce() {}

    /**
     * @description  ��д���ӷ���
     * @author  xxliao
     * @date  2024/5/25 18:13
     */
    @Override
    public boolean isAddOil() {
        return false;
    }
}
