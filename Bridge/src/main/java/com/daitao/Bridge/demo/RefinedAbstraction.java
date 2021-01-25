package com.daitao.Bridge.demo;

/**
 * @author 戴涛
 * @Content 扩展抽象化角色
 * @CreateTime 2021/1/25
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    public void Operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.OperationImpl();
    }
}
