package com.daitao.Command.demo.example;

/**
 * @author 戴涛
 * @Content 具体命令：馄饨
 * @CreateTime 2021/1/26
 */
public class HunTun implements Breakfast {

    private HunTunChef receiver;
    HunTun() {
        receiver = new HunTunChef();
    }
    public void cooking() {
        receiver.cooking();
    }
}
