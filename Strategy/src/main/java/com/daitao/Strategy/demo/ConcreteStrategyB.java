package com.daitao.Strategy.demo;

/**
 * @author 戴涛
 * @Content 具体策略类B
 * @CreateTime 2021/1/26
 */
public class ConcreteStrategyB implements Strategy {
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
