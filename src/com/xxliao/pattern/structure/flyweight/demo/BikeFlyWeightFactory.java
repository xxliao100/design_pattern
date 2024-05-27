package com.xxliao.pattern.structure.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xxliao
 * @description: ��Ԫ����
 * @date 2024/5/25 17:23
 */
public class BikeFlyWeightFactory {

    // ��������
    public static Map<String,Bike> bikeMap = new HashMap<>();

    // ��ȡ��Ԫ����
    public static Bike getBike(String color,String type) {
        String key = color + "-" + type;
        if(bikeMap.containsKey(key)) {
            // �Ѿ��ڻ��������У�ֱ�ӷ���
            return bikeMap.get(key);
        }else {
            // ������û�У��½����뻺���У�Ȼ�󷵻�
            Bike bike = null;
            if("mobike".equals(type)) {
                bike = new MoBike(color,199);
            }else if("ofobike".equals(type)) {
                bike = new OfoBike(color,199);
            }
            bikeMap.put(key,bike);
            return bike;
        }
    }
}

