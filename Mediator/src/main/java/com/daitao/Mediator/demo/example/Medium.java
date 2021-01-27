package com.daitao.Mediator.demo.example;

/**
 * @author 戴涛
 * @Content 抽象中介者：中介公司
 * @CreateTime 2021/1/27
 */
public interface Medium {
    void register(Customer member); //客户注册
    void relay(String from, String ad); //转发
}
