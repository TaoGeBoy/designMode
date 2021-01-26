package com.daitao.ChainOfResponsibility.demo.example;

/**
 * @author 戴涛
 * @Content 具体处理者4：教务处长类
 * @CreateTime 2021/1/26
 */
public class DeanOfStudies extends Leader {
    public void handleRequest(int LeaveDays) {
        if (LeaveDays <= 20) {
            System.out.println("教务处长批准您请假" + LeaveDays + "天。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(LeaveDays);
            } else {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
