package com.daitao.TemplateMethod.demo;

/**
 * @author 戴涛
 * @Content 具体子类
 * @CreateTime 2021/1/26
 */
public class ConcreteClass extends AbstractClass {
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }

    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
