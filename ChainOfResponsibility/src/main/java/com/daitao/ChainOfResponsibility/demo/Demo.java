package com.daitao.ChainOfResponsibility.demo;

/**
 * @author 戴涛
 * @Content 责任链设计模式测试
 * @CreateTime 2021/1/26
 */
public class Demo {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
