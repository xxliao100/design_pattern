package com.xxliao.pattern.creational.factory.factory_method.demo;

/**
 * @author xxliao
 * @description: øß∑»µÍ¿‡
 * @date 2024/5/23 22:10
 */

public class CoffeeStore {

   private CoffeeFactory coffeeFactory;

   public CoffeeStore(CoffeeFactory coffeeFactory) {
       this.coffeeFactory = coffeeFactory;
   }

    /**
     * @description  øß∑»µ„≤Õ
     * @author  xxliao
     * @date  2024/5/23 22:12
     */
    public Coffee orderCoffee() {
       return coffeeFactory.createCoffee();
    }
}
