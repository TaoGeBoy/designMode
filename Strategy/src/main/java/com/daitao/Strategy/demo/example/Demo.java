package com.daitao.Strategy.demo.example;

/**
 * @author 戴涛
 * @Content 策略设计模式（大闸蟹做法）
 * @CreateTime 2021/1/26
 */
public class Demo {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.setStrategy(new SteamedCrabs());
        kitchen.CookingMethod();
    }
}
