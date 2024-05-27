package com.xxliao.pattern.creational.prototype.deep_clone_demo;

import java.io.*;

/**
 * @author xxliao
 * @description: 深拷贝实现-重写clone方法
 * @date 2024/5/24 13:41
 */

public class DeepCloneable implements Cloneable,Serializable{

    private String name;

    private DeepCloneable friend;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneable getFriend() {
        return friend;
    }

    public void setFriend(DeepCloneable friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "DeepCloneable{" +
                "name='" + name + '\'' +
                ", friend=" + friend +
                '}';
    }

    /**
     * @description  重写clone方法 实现深拷贝
     * @author  xxliao
     * @date  2024/5/24 13:50
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        DeepCloneable deepCloneable = (DeepCloneable) deep;
        System.out.println(this);
        deepCloneable.friend = friend != null ? (DeepCloneable) friend.clone() : null;
        return deepCloneable;
    }

    /**
     * @description  利用对象的序列化实现深拷贝
     * @author  xxliao
     * @date  2024/5/24 13:50
     */

    public Object deepClone(){
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前对象用对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {

            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
