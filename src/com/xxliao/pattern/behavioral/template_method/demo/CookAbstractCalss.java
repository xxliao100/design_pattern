package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: ������ -
 * @date 2024/5/25 18:03
 */
public abstract class CookAbstractCalss {

    /**
     * @description  ģ�巽��
     * @author  xxliao
     * @date  2024/5/25 18:08
     */
    public final void cook() {
        if(isAddOil()) {
            this.pourOil();
        }
        this.heatOil();
        this.addVegetable();
        this.addSauce();
        this.fry();
    }

    // ���巽��
    public void pourOil() {
        System.out.println("����");
    }

    // ���巽��
    public void heatOil() {
        System.out.println("����");
    }

    /**
     * @description  ���󷽷���������ʵ��
     * @author  xxliao
     * @date  2024/5/25 18:05
     */
    public abstract void addVegetable();

    /**
     * @description  ���󷽷���������ʵ��
     * @author  xxliao
     * @date  2024/5/25 18:06
     */
    public abstract void addSauce();

    // ���巽��
    public void fry() {
        System.out.println("����");
    }

    /**
     * @description  ���ӷ���
     * @author  xxliao
     * @date  2024/5/25 18:10
     */
    public boolean isAddOil() {
        return true;
    }
}
