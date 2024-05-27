package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: 具体元素角色，接受一个访问者方法
 * @date 2024/5/26 0:18
 */
public class Man extends Person{


    /**
     * @description  具体元素角色提供给访问者的防方法，访问者通过参数传递进来
     * @author  xxliao
     * @date  2024/5/26 0:29
     */
    @Override
    public void result(ActionVisitor actionVisitor) {
        // 访问者对象 获取 本元素（man）对象的结果,将本对象自己传递进去，这里使用了双分派
        actionVisitor.getManResult(this);
    }
}
