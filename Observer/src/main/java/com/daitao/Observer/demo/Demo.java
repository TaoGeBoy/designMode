package com.daitao.Observer.demo;

/**
 * @author 戴涛
 * @Content 监听者设计模式测试
 * @CreateTime 2021/1/27
 */
public class Demo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ConcreteObserver1();
        Observer obs2 = new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
