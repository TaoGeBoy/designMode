package com.daitao.Flyweight.demo;

/**
 * @author 戴涛
 * @Content 抽象享元角色
 * @CreateTime 2021/1/26
 */
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}
