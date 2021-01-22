package com.daitao.factoryPattern.demo.AbstractFactoryPattern;

/**
 * @author 戴涛
 * @Content 具体工厂：上饶农场类
 * @CreateTime 2021/1/22
 */
public class SRfarm implements Farm {
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}
