package com.daitao.factoryPattern.demo.FactoryfFunctionPattern;

/**
 * @author 戴涛
 * @Content 具体产品1：实现抽象产品中的抽象方法
 * @CreateTime 2021/1/22
 */
public class ConcreteProduct1 implements Product {
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
