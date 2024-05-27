package com.xxliao.pattern.creational.prototype.deep_clone_demo;

import java.io.*;

/**
 * @author xxliao
 * @description: ���ʵ��-��дclone����
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
     * @description  ��дclone���� ʵ�����
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
     * @description  ���ö�������л�ʵ�����
     * @author  xxliao
     * @date  2024/5/24 13:50
     */

    public Object deepClone(){
        // ����������
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            // ���л�
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // ��ǰ�����ö������ķ�ʽ���

            // �����л�
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
