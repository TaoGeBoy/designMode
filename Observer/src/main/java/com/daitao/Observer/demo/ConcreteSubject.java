package com.daitao.Observer.demo;

/**
 * @author 戴涛
 * @Content 具体目标
 * @CreateTime 2021/1/27
 */
public class ConcreteSubject extends Subject {
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Object obs : observers) {
            ((Observer) obs).response();
        }
    }
}
