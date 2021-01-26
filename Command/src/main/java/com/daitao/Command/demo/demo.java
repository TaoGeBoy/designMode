package com.daitao.Command.demo;

/**
 * @author 戴涛
 * @Content 命令设计模式测试
 * @CreateTime 2021/1/26
 */
public class demo {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
