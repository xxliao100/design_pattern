package com.xxliao.pattern.structure.facade;

/**
 * @author xxliao
 * @description: 设计模式-结构型模式-外观模式
 *
 * 定义：外观模式 又叫 门面模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。
 *
 * 结构：
 * 1.外观角色：Facade，为多个子系统对外提供一个共同地接口。
 * 2.子系统角色：Sub System，实现系统地部分功能，客户可以通过外观角色访问它。
 *
 * 优点：该模式对外有一个统一接口，外部不需要关心子系统的具体细节，大大地降低应用程序地复杂度，提高了程序地可维护性。
 * 缺点：不符合开闭原则
 *
 * 实际使用：MyBatis的Configuration配置类，
 *
 * @date 2024/5/25 14:07
 */

public class FacadePattern {
}
