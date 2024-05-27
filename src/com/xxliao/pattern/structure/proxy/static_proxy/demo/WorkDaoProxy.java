package com.xxliao.pattern.structure.proxy.static_proxy.demo;

/**
 * @author xxliao
 * @description: 代理类
 * @date 2024/5/24 18:35
 */

public class WorkDaoProxy implements IWorkDao {

    // 目标对象，通过接口来聚合
    private IWorkDao target;

    // 通过构造器 填充目标对象
    public WorkDaoProxy(IWorkDao target) {
        this.target = target;
    }


    // 方法中对目标对象的目标方法进行 增强等功能。
    @Override
    public void work() {
        System.out.println("before work method ... ");
        target.work();
        System.out.println("after work method ...");
    }
}
