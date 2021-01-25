package com.daitao.Decorator.demo.example;

/**
 * @author 戴涛
 * @Content 具体装饰角色：少女
 * @CreateTime 2021/1/25
 */
public class Girl extends Changer {
    public Girl(Morrigan m) {
        super(m);
    }

    public void display() {
        System.out.println("少女装");
        super.display();
    }

}
