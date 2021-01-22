package com.daitao.factoryPattern.demo.AbstractFactoryPattern;

/**
 * @author 戴涛
 * @Content 具体产品：蔬菜类
 * @CreateTime 2021/1/22
 */
public class Vegetables implements Plant{
    public void show() {
        System.out.println("我是一种蔬菜");
    }
}
