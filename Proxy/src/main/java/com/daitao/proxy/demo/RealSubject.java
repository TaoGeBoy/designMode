package com.daitao.proxy.demo;

/**
 * @author 戴涛
 * @Content 真实主题
 * @CreateTime 2021/1/25
 */
public class RealSubject implements Subject{
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
