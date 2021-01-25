package com.daitao.builderPattern.demo;

/**
 * @author 戴涛
 * @Content 建造者模式演示
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        Decorator d = new ConcreteDecorator1();
        ProjectManager p = new ProjectManager(d);
        Parlour decorate = p.decorate();
        decorate.show();
    }
}
