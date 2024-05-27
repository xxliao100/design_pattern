package com.xxliao.pattern.structure.adapter.object_adapter.demo;

import com.xxliao.pattern.structure.adapter.class_adapter.demo.Voltage220V;

/**
 * @author xxliao
 * @description: ÊÊÅäÆ÷Àà
 *
 * @date 2024/5/25 0:04
 */
public class Adapter implements IVoltage5V {


    private Voltage220V voltage220V;

    public Adapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dest = src / 44;
        System.out.println(src+"v ==> "+dest+"V");
        return dest;
    }
}
