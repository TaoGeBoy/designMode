package com.daitao.Prototype.demo;

/**
 * @author 戴涛
 * @Content 具体原型类
 * @CreateTime 2021/1/22
 */
public class Realizetype implements Cloneable{
    public Realizetype(){
        System.out.println("具体原型创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype) super.clone();
    }
}
