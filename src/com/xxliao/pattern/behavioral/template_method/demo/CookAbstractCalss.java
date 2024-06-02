package com.xxliao.pattern.behavioral.template_method.demo;

/**
 * @author xxliao
 * @description: 抽象类 -
 * @date 2024/5/25 18:03
 */
public abstract class CookAbstractCalss {

    /**
     * @description  模板方法
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

    // 具体方法
    public void pourOil() {
        System.out.println("倒油");
    }

    // 具体方法
    public void heatOil() {
        System.out.println("加热");
    }

    /**
     * @description  抽象方法，让子类实现
     * @author  xxliao
     * @date  2024/5/25 18:05
     */
    public abstract void addVegetable();

    /**
     * @description  抽象方法，让子类实现
     * @author  xxliao
     * @date  2024/5/25 18:06
     */
    public abstract void addSauce();

    // 具体方法
    public void fry() {
        System.out.println("翻炒");
    }

    /**
     * @description  钩子方法
     * @author  xxliao
     * @date  2024/5/25 18:10
     */
    public boolean isAddOil() {
        return true;
    }
}
