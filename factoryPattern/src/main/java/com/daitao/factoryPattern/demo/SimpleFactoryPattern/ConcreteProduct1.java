package com.daitao.factoryPattern.demo.SimpleFactoryPattern;

/**
 * @author 戴涛
 * @Content 具体产品： A
 * @CreateTime 2021/1/22
 */
public class ConcreteProduct1 implements Product{
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
