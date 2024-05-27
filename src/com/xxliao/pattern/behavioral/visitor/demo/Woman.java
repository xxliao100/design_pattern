package com.xxliao.pattern.behavioral.visitor.demo;

/**
 * @author xxliao
 * @description: 具体元素角色
 * @date 2024/5/26 0:19
 */
public class Woman extends Person{

    /**
     * @description  具体元素角色提供给访问者的防方法，访问者通过参数传递进来
     * @author  xxliao
     * @date  2024/5/26 0:29
     */
    @Override
    public void result(ActionVisitor actionVisitor) {
        // 访问者对象 获取 本元素（woman）对象的结果,将本对象自己传递进去，这里使用了双分派
        actionVisitor.getWomanResult(this);
    }
}
