package com.xxliao.pattern.creational.prototype.demo;

/**
 * @author xxliao
 * @description: TODO
 * @date 2024/5/24 13:27
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom",1,"°×É«","ÄÚÃÉ");
        sheep.friend = new Sheep("timi",2,"ºÚÉ«","ÄþÏÄ");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println("sheep1="+sheep1+"sheep1.friend="+sheep1.friend.hashCode());
        System.out.println("sheep2="+sheep2+"sheep2.friend="+sheep2.friend.hashCode());
        System.out.println("sheep3="+sheep3+"sheep3.friend="+sheep3.friend.hashCode());
        System.out.println("sheep4="+sheep4+"sheep4.friend="+sheep4.friend.hashCode());
    }
}
