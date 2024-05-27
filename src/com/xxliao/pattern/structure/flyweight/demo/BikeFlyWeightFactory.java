package com.xxliao.pattern.structure.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xxliao
 * @description: 享元工厂
 * @date 2024/5/25 17:23
 */
public class BikeFlyWeightFactory {

    // 缓存容器
    public static Map<String,Bike> bikeMap = new HashMap<>();

    // 获取享元对象
    public static Bike getBike(String color,String type) {
        String key = color + "-" + type;
        if(bikeMap.containsKey(key)) {
            // 已经在缓存容器中，直接返回
            return bikeMap.get(key);
        }else {
            // 缓存中没有，新建放入缓存中，然后返回
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

