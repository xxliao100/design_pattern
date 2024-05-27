package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: ���󹹼���-��ͳ�����
 * @date 2024/5/25 12:41
 */
public abstract class FastFood {

    private float price;

    private String desc;

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    /**
     * @description  ��ȡ�۸񷽷�
     * @author  xxliao
     * @date  2024/5/25 12:42
     */
    public abstract float cost();

}
