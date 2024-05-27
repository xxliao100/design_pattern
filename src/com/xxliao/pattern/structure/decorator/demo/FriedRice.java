package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: ���幹���� - ����
 * @date 2024/5/25 12:43
 */

public class FriedRice extends FastFood{

    public FriedRice(){
        super(10,"����");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
