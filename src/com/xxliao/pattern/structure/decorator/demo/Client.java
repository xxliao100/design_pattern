package com.xxliao.pattern.structure.decorator.demo;

/**
 * @author xxliao
 * @description: װ����ģʽ ���Կͻ���
 * @date 2024/5/25 12:54
 */
public class Client {
    public static void main(String[] args) {
        // ��һ�ݳ���
        FastFood friedRice = new FriedRice();

        System.out.println(friedRice.getDesc()+" "+friedRice.cost()+"Ԫ");

        // ���һ������
        FastFood eggFriedRice = new Egg(friedRice);
        //
        System.out.println(eggFriedRice.getDesc()+" "+eggFriedRice.cost()+"Ԫ");
    }
}
