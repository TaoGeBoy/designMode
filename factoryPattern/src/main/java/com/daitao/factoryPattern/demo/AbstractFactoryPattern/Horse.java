package com.daitao.factoryPattern.demo.AbstractFactoryPattern;

/**
 * @author 戴涛
 * @Content 具体产品：马类
 * @CreateTime 2021/1/22
 */
public class Horse implements Animal{
    public void show() {
        System.out.println("我是一只马");
    }
}
