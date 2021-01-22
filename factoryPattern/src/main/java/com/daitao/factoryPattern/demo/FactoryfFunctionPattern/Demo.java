package com.daitao.factoryPattern.demo.FactoryfFunctionPattern;

/**
 * @author 戴涛
 * @Content 测试工厂方法模式
 * @CreateTime 2021/1/22
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.newProduct().show();
    }
}
