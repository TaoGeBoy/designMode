package com.daitao.Memento.demo;

/**
 * @author 戴涛
 * @Content 备忘录
 * @CreateTime 2021/1/27
 */
public class Memento {
    private String state;
    public Memento(String state) {
        this.state = state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
