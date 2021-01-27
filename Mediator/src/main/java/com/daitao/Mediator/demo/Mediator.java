package com.daitao.Mediator.demo;

/**
 * @author 戴涛
 * @Content 抽象中介者
 * @CreateTime 2021/1/27
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
