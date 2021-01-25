package com.daitao.Bridge.demo;

/**
 * @author 戴涛
 * @Content 具体实现化角色
 * @CreateTime 2021/1/25
 */
public class ConcreteImplementorA implements Implementor {
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
