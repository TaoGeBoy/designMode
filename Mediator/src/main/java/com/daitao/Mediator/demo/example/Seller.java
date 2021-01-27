package com.daitao.Mediator.demo.example;

import java.awt.event.ActionEvent;

/**
 * @author 戴涛
 * @Content 具体同事类：卖方
 * @CreateTime 2021/1/27
 */
public class Seller extends Customer {
    private static final long serialVersionUID = -1443076716629516027L;
    public Seller(String name) {
        super(name);
        ClientWindow(50, 100);
    }
    public void send(String ad) {
        ReceiveArea.append("我(卖方)说: " + ad + "\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
        medium.relay(name, ad);
    }
    public void receive(String from, String ad) {
        ReceiveArea.append(from + "说: " + ad + "\n");
        //使滚动条滚动到最底端
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
    }
}
