package com.daitao.Visitor.demo;

/**
 * @author 戴涛
 * @Content 具体元素A类
 * @CreateTime 2021/1/27
 */
public class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String operationA() {
        return "具体元素A的操作。";
    }
}
