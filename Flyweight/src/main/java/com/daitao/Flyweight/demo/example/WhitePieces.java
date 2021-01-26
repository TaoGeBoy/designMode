package com.daitao.Flyweight.demo.example;

import java.awt.*;

/**
 * @author 戴涛
 * @Content 具体享元角色：白子
 * @CreateTime 2021/1/26
 */
public class WhitePieces implements ChessPieces {
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.WHITE);
        g.fillOval(pt.x, pt.y, 30, 30);
    }
}
