package com.daitao.factoryPattern.demo.AbstractFactoryPattern;

/**
 * @author 戴涛
 * @Content 测试抽象工厂类
 * @CreateTime 2021/1/22
 */
public class Demo {
    public static void main(String[] args) {
        SGfarm sGfarm = new SGfarm();
        sGfarm.newAnimal().show();
    }
}
