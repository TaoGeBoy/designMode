package com.daitao.Command.demo;

/**
 * @author 戴涛
 * @Content 调用者
 * @CreateTime 2021/1/26
 */
public class Invoker {

    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
