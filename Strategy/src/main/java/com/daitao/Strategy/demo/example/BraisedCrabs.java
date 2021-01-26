package com.daitao.Strategy.demo.example;

/**
 * @author 戴涛
 * @Content 具体策略类：红烧大闸蟹
 * @CreateTime 2021/1/26
 */
public class BraisedCrabs implements CrabCooking {
    public void CookingMethod() {
        System.out.println("这是红烧大闸蟹做法");
    }
}
