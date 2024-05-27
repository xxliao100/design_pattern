package com.xxliao.pattern.behavioral.template_method;

/**
 * @author xxliao
 * @description: 设计模式-行为型模式-模板方法模式
 *
 * 定义：模板方法模式 是一种基于继承实现的设计模式，主要思想是：将定义的算法抽象成一组步骤，在抽象类中定义算法的骨架，把具体实现留给子类来实现。
 *
 * 结构：
 * 1.抽象类（Abstract）：定义了算法股价，包含了一个或者多个抽象方法，这些方法由子类来具体实现。
 *                    抽象类中通常还包含一个模板方法，用来调用抽象方法和具体方法，控制算法执行的顺序。
 *                    抽象类中还可以定义钩子方法，用于控制模板方法中的条件控制。
 * 2.具体类（Concrete Class）：继承抽象类，实现抽象方法。
 *
 * 优点：提高代码复用性，符合开闭原则，提高代码可维护性。
 * 缺点：每一个不同的实现都需要一个子类来解决。
 *
 * 实际使用： JDBCTemplate，HttpServlet,Servlet过滤器
 *
 * @date 2024/5/25 17:42
 */
public class TemplateMethodPattern {

}
