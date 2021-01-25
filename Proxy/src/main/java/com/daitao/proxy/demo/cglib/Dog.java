package com.daitao.proxy.demo.cglib;

/**
 * @author 戴涛
 * @Content
 * @CreateTime 2021/1/25
 */
public class Dog {
    final public void run(String name) {
        System.out.println("狗"+name+"----run");
    }

    public void eat() {
        System.out.println("狗----eat");
    }
}
