package com.daitao.Bridge.demo;

/**
 * @author 戴涛
 * @Content 桥接设计模式测试
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
