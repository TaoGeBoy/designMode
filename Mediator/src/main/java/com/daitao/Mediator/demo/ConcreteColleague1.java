package com.daitao.Mediator.demo;

/**
 * @author 戴涛
 * @Content 具体同事类1
 * @CreateTime 2021/1/27
 */
public class ConcreteColleague1 extends Colleague {
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
