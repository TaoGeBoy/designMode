package com.daitao.Decorator.demo;

/**
 * @author 戴涛
 * @Content 装饰模式测试
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
