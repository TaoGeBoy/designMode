package com.daitao.factoryPattern.demo.FactoryfFunctionPattern;

/**
 * @author 戴涛
 * @Content 具体工厂1：实现了厂品的生成方法
 * @CreateTime 2021/1/22
 */
public class ConcreteFactory1 implements AbstractFactory{
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
