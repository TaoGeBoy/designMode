package com.daitao.Command.demo;

/**
 * @author 戴涛
 * @Content 具体命令
 * @CreateTime 2021/1/26
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;
    ConcreteCommand() {
        receiver = new Receiver();
    }

    public void execute() {
        receiver.action();
    }
}
