package com.daitao.Decorator.demo.example;

/**
 * @author 戴涛
 * @Content 抽象装饰角色：变形
 * @CreateTime 2021/1/25
 */
public class Changer implements Morrigan {
    Morrigan m;

    public Changer(Morrigan m) {
        this.m = m;
    }
    public void display() {
        m.display();
    }
}
