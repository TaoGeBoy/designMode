package com.daitao.ChainOfResponsibility.demo;

/**
 * @author 戴涛
 * @Content 具体处理者角色1
 * @CreateTime 2021/1/26
 */
public class ConcreteHandler1 extends Handler {
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                System.out.println("经过具体处理者1,但是没有处理");
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
