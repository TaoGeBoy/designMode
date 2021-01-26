package com.daitao.Strategy.demo;

/**
 * @author 戴涛
 * @Content 策略设计模式测试
 * @CreateTime 2021/1/26
 */
public class demo {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
