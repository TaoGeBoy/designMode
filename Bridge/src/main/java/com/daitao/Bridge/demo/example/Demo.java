package com.daitao.Bridge.demo.example;

/**
 * @author 戴涛
 * @Content 桥接模式（买包测试）
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        Color color;
        Bag bag;
        color = new Red();
        bag = new HandBag();
        bag.setColor(color);
        String name = bag.getName();
        System.out.println(name);
    }
}
