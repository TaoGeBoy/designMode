package com.daitao.Prototype.demo;

import com.daitao.Prototype.demo.PrototypeManager.Circle;
import com.daitao.Prototype.demo.PrototypeManager.ProtoTypeManager;
import com.daitao.Prototype.demo.PrototypeManager.Shape;

/**
 * @author 戴涛
 * @Content
 * @CreateTime 2021/1/22
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = (Realizetype) realizetype.clone();

        SunWukong sunWukong = new SunWukong();
        SunWukong sunWukong1 = (SunWukong) sunWukong.clone();

        //原型管理器
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle) pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = (Shape) pm.getShape("Square");
        obj2.countArea();    }
}
