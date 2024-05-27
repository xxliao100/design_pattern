package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: ����װ���� - �����࣬�̳�FastFood�����ۺ�FastFood��
 * @date 2024/5/25 12:46
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }
}
