package com.xxliao.pattern.creational.builder.expansion;

/**
 * @author xxliao
 * @description: builder ʹ��ģʽ��չ
 * @date 2024/5/24 17:43
 */

public class AppendBuilder {

    private String name;

    private String sex;

    private String address;

    private String idCard;

    public AppendBuilder(Builder builder) {
        name = builder.name;
        sex = builder.sex;
        address = builder.address;
        idCard = builder.idCard;
    }

    @Override
    public String toString() {
        return "AppendBuilder{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }

    // ����builder
    public static final class Builder{
        private String name;

        private String sex;

        private String address;

        private String idCard;

        public Builder() {

        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder sex(String val) {
            sex = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder idCard(String val) {
            idCard = val;
            return this;
        }

        public AppendBuilder build() {
            return new AppendBuilder(this);
        }
    }
}
