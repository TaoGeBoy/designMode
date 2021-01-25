package com.daitao.Decorator.demo.example;

/**
 * @author 戴涛
 * @Content 具体装饰角色：女妖
 * @CreateTime 2021/1/25
 */
public class Succubus extends Changer{
    public Succubus(Morrigan m) {
        super(m);
    }

    public void display() {
        System.out.println("女妖装");
        super.display();
    }
}
