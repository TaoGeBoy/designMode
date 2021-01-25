package com.daitao.Bridge.demo;

/**
 * @author 戴涛
 * @Content 抽象化角色
 * @CreateTime 2021/1/25
 */
abstract class Abstraction {
    protected Implementor imple;
    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }
    public abstract void Operation();
}
