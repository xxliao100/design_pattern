package com.xxliao.principle.specific;

/**
 *
 * @description: 接口隔离原则
 *
 * 定义：接口隔离原则就是，客户端不应该依赖它不需要的接口，也就是一个类对另一个类的依赖应该建立在最小的接口上。
 *
 * 举例：接口A存在１－５个方法，类B实现接口A并实际重写了了１－３方法，类C实现接口A并实际重写了３－５方法，客户端类D通过接口A依赖了类B和C。
 * 问题：那么对于类B和类C来说，对于接口A的依赖就没有建立在最小接口上。
 * 改进：需要将接口A拆分为A1并实际重写1-3方法，和接口A2并实际重写3-5方法，然后类B实现接口A1，类C实现接口A2.
 *
 * @author xxliao
 * @date 2024/5/21 22:22
 */

public class InterfaceSegregation {

    
}
