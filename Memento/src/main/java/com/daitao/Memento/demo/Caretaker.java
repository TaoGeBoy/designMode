package com.daitao.Memento.demo;

/**
 * @author 戴涛
 * @Content 管理者
 * @CreateTime 2021/1/27
 */
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento m) {
        memento = m;
    }
    public Memento getMemento() {
        return memento;
    }
}
