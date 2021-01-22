package com.daitao.factoryPattern.demo.AbstractFactoryPattern;

/**
 * @author 戴涛
 * @Content 具体工厂：韶关农场类
 * @CreateTime 2021/1/22
 */
public class SGfarm implements Farm {
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
