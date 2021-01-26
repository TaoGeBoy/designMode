package com.daitao.Strategy.demo;

/**
 * @author 戴涛
 * @Content 具体策略类A
 * @CreateTime 2021/1/26
 */
public class ConcreteStrategyA implements Strategy {
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
