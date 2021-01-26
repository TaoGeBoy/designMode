package com.daitao.Flyweight.demo.example;

import java.awt.*;

/**
 * @author 戴涛
 * @Content 抽象享元角色：棋子
 * @CreateTime 2021/1/26
 */
public interface ChessPieces {
    public void DownPieces(Graphics g, Point pt);    //下子
}
