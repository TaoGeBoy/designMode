package com.daitao.Mediator.demo;

/**
 * @author 戴涛
 * @Content 中介者设计模式测试
 * @CreateTime 2021/1/27
 */
public class demo {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2, c3;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        c3 = new ConcreteColleague3();
        md.register(c1);
        md.register(c2);
        md.register(c3);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
