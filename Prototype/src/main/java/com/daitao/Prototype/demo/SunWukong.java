package com.daitao.Prototype.demo;

/**
 * @author 戴涛
 * @Content
 * @CreateTime 2021/1/22
 */
public class SunWukong implements Cloneable {
    private String name = "孙悟空";
    private String weapons = "镇海神针";

    public SunWukong() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("孙悟空复制成功");
        return (SunWukong) super.clone();
    }
}


