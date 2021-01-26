package com.daitao.Flyweight.demo;

/**
 * @author 戴涛
 * @Content 非享元角色
 * @CreateTime 2021/1/26
 */
public class UnsharedConcreteFlyweight {
    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
