package com.daitao.builderPattern.demo;

/**
 * @author 戴涛
 * @Content 体建造者：具体装修工人2
 * @CreateTime 2021/1/22
 */
public class ConcreteDecorator2 extends Decorator {
    @Override
    public void buildWall() {
        product.setWall("w2");
    }

    @Override
    public void buildTV() {
        product.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
