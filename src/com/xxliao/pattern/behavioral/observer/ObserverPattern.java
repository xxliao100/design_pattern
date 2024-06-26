package com.xxliao.pattern.behavioral.observer;

/**
 * @author xxliao
 * @description: 设计模式-行为型模式-观察者模式
 *
 * 定义：观察者模式 又称为 发布-订阅（Publish-Subscribe）模式，定义了一对多的依赖关系，让多个观察者对象同事监听某一个主题对象。当这个主题对象
 *      在状态变化时，会通知所有的观察者对象。
 *
 * 结构：
 * 1.抽象主题（Subject）：抽象主题（抽象被观察者），抽象主题角色把所有观察者对象保存在一个集合里，每个主题都可以有任意数量的观察者，
 *   抽象主题提供一个接口，可以增加和删除观察者对象。
 * 2.具体主题(Concrete Subject):具体主题（具体被观察者），该角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，
 *   给所有注册过的观察者发送通知。
 * 3.抽象观察者（Observer）:抽象观察者，它定义了一个跟新接口，使得在得到主题更改通知时跟新自己。
 * 4.具体观察者(Concrete Observer):具体观察者，实现抽象观察者定义的跟新接口，以便在得到主题更改通知时跟新自身的状态。
 *
 * 优点： 降低了目标和观察者之间的耦合关系，被观察者发送通知，所有观察者对象都能收到消息。
 *
 * 实际使用：
 *  JDK中的Observable 和 Observer
 *
 * @date 2024/5/26 12:24
 */

public class ObserverPattern {
}
