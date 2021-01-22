package com.daitao.factoryPattern.demo.AbstractFactoryPattern;

/**
 * @author 戴涛
 * @Content 抽象工厂：农场类
 * @CreateTime 2021/1/22
 */
public interface Farm {
    public Animal newAnimal();
    public Plant newPlant();
}
