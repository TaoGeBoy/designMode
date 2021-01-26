package com.daitao.State.demo;

/**
 * @author 戴涛
 * @Content 具体状态A类
 * @CreateTime 2021/1/26
 */
public class ConcreteStateA extends State {
    public void Handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
