package com.daitao.Command.demo.example;

/**
 * @author 戴涛
 * @Content 具体命令：河粉
 * @CreateTime 2021/1/26
 */
public class HeFen implements Breakfast {
    private HeFenChef receiver;
    HeFen() {
        receiver = new HeFenChef();
    }
    public void cooking() {
        receiver.cooking();
    }
}
