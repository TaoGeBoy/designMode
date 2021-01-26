package com.daitao.Strategy.demo.example;

/**
 * @author 戴涛
 * @Content 具体策略类：清蒸大闸蟹
 * @CreateTime 2021/1/26
 */
public class SteamedCrabs implements CrabCooking {

    public void CookingMethod() {
        System.out.println("这是清蒸大杂蟹做法");
    }
}
