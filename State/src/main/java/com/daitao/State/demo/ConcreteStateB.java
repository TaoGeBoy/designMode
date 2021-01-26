package com.daitao.State.demo;

/**
 * @author 戴涛
 * @Content 具体状态B类
 * @CreateTime 2021/1/26
 */
public class ConcreteStateB extends State {
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}
