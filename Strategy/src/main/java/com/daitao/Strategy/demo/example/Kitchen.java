package com.daitao.Strategy.demo.example;

/**
 * @author 戴涛
 * @Content 环境类：厨房
 * @CreateTime 2021/1/26
 */
public class Kitchen {
    private CrabCooking strategy;    //抽象策略
    public void setStrategy(CrabCooking strategy) {
        this.strategy = strategy;
    }
    public CrabCooking getStrategy() {
        return strategy;
    }
    public void CookingMethod() {
        strategy.CookingMethod();    //做菜
    }
}
