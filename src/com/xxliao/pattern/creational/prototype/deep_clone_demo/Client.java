package com.xxliao.pattern.creational.prototype.deep_clone_demo;

/**
 * @author xxliao
 * @description: ������Կͻ���
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
        // ������ - ��дclone
        DeepCloneable clone = (DeepCloneable) one.clone();
        System.out.println(clone);

        // ������ - ���л�
        DeepCloneable deepCloneable = (DeepCloneable) one.deepClone();
        System.out.println(deepCloneable);
    }
}
