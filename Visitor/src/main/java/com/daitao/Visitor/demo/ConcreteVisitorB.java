package com.daitao.Visitor.demo;

/**
 * @author 戴涛
 * @Content 具体访问者B类
 * @CreateTime 2021/1/27
 */
public class ConcreteVisitorB implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
