package com.daitao.Observer.demo;

/**
 * @author 戴涛
 * @Content 具体观察者1
 * @CreateTime 2021/1/27
 */
public class ConcreteObserver1 implements Observer {
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
