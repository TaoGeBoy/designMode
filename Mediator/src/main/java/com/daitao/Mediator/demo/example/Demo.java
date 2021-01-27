package com.daitao.Mediator.demo.example;

/**
 * @author 戴涛
 * @Content 中介者设计模式测试（房地产）
 * @CreateTime 2021/1/27
 */
public class Demo {
    public static void main(String[] args) {
        Medium md = new EstateMedium();    //房产中介
        Customer member1, member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        md.register(member1); //客户注册
        md.register(member2);
    }
}
