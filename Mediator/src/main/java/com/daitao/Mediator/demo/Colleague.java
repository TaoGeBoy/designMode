package com.daitao.Mediator.demo;

/**
 * @author 戴涛
 * @Content 抽象同事类
 * @CreateTime 2021/1/27
 */
abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
