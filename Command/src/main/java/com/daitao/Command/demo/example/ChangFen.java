package com.daitao.Command.demo.example;

/**
 * @author 戴涛
 * @Content 具体命令：肠粉
 * @CreateTime 2021/1/26
 */
public class ChangFen implements Breakfast {
    private ChangFenChef receiver;

    ChangFen() {
        receiver = new ChangFenChef();
    }

    public void cooking() {
        receiver.cooking();
    }
}
