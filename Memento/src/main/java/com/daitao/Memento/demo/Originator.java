package com.daitao.Memento.demo;

/**
 * @author 戴涛
 * @Content 发起人
 * @CreateTime 2021/1/27
 */
public class Originator {
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public Memento createMemento() {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
