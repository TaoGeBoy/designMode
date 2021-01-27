package com.daitao.Visitor.demo;

/**
 * @author 戴涛
 * @Content 抽象元素类
 * @CreateTime 2021/1/27
 */
public interface Element {
    void accept(Visitor visitor);
}
