package com.daitao.ChainOfResponsibility.demo.example;

/**
 * @author 戴涛
 * @Content 抽象处理者：领导类
 * @CreateTime 2021/1/26
 */
abstract class Leader {
    private Leader next;
    public void setNext(Leader next) {
        this.next = next;
    }
    public Leader getNext() {
        return next;
    }
    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);
}
