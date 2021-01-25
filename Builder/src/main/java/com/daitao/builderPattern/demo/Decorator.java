package com.daitao.builderPattern.demo;

/**
 * @author 戴涛
 * @Content 抽象建造者： 建筑工人
 * @CreateTime 2021/1/22
 */
abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}
