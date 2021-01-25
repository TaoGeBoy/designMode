package com.daitao.Decorator.demo.example;

/**
 * @author 戴涛
 * @Content 装饰模式（“莫莉卡·安斯兰”的变身）
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        Morrigan m0 = new original();
        m0.display();
        Morrigan m1 = new Succubus(m0);
        m1.display();
        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}
