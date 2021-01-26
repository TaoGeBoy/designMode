package com.daitao.Flyweight.demo.example;

import java.util.ArrayList;

/**
 * @author 戴涛
 * @Content 享元工厂角色
 * @CreateTime 2021/1/26
 */
public class WeiqiFactory {
    private ArrayList<ChessPieces> qz;

    public WeiqiFactory() {
        qz = new ArrayList<ChessPieces>();
        ChessPieces w = new WhitePieces();
        qz.add(w);
        ChessPieces b = new BlackPieces();
        qz.add(b);
    }
    public ChessPieces getChessPieces(String type) {
        if (type.equalsIgnoreCase("w")) {
            return (ChessPieces) qz.get(0);
        } else if (type.equalsIgnoreCase("b")) {
            return (ChessPieces) qz.get(1);
        } else {
            return null;
        }
    }
}
