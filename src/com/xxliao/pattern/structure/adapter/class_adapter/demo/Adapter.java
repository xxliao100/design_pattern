package com.xxliao.pattern.structure.adapter.class_adapter.demo;

/**
 * @author xxliao
 * @description: ÊÊÅäÆ÷Àà
 *
 * @date 2024/5/25 0:04
 */
public class Adapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        int src = output220V();
        int dest = src / 44;
        System.out.println(src+"v ==> "+dest+"V");
        return dest;
    }
}
