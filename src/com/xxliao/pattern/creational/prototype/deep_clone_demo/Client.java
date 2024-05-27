package com.xxliao.pattern.creational.prototype.deep_clone_demo;

/**
 * @author xxliao
 * @description: 深拷贝测试客户端
 * @date 2024/5/24 13:57
 */

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloneable one = new DeepCloneable();
        one.setName("one");
        DeepCloneable two = new DeepCloneable();
        two.setName("two");
        one.setFriend(two);

        System.out.println(one);
        // 完成深拷贝 - 重写clone
        DeepCloneable clone = (DeepCloneable) one.clone();
        System.out.println(clone);

        // 完成深拷贝 - 序列化
        DeepCloneable deepCloneable = (DeepCloneable) one.deepClone();
        System.out.println(deepCloneable);
    }
}
