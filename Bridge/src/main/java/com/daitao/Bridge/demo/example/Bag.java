package com.daitao.Bridge.demo.example;

/**
 * @author 戴涛
 * @Content 抽象化角色：包
 * @CreateTime 2021/1/25
 */
abstract class Bag {
    protected Color color;
    public void setColor(Color color) {
        this.color = color;
    }
    public abstract String getName();
}
