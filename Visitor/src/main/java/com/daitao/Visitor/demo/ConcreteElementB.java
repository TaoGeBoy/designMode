package com.daitao.Visitor.demo;

/**
 * @author 戴涛
 * @Content 具体元素B类
 * @CreateTime 2021/1/27
 */
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationB() {
        return "具体元素B的操作。";
    }
}
