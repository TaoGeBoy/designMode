package com.daitao.Visitor.demo;

/**
 * @author 戴涛
 * @Content 抽象访问者
 * @CreateTime 2021/1/27
 */
public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
