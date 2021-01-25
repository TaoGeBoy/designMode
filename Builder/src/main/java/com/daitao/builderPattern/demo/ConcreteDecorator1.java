package com.daitao.builderPattern.demo;

/**
 * @author 戴涛
 * @Content 具体建造者：具体装修工人1
 * @CreateTime 2021/1/22
 */
public class ConcreteDecorator1 extends Decorator{
    @Override
    public void buildWall() {
        product.setWall("w1");
    }

    @Override
    public void buildTV() {
        product.setTV("TV1");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
