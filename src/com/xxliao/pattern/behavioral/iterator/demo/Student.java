package com.xxliao.pattern.behavioral.iterator.demo;

/**
 * @author xxliao
 * @description: Student ΚµΜε
 * @date 2024/5/26 12:03
 */

public class Student {

    private String name;

    private String sex;

    private String idCard;

    public Student(String name, String sex, String idCard) {
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
