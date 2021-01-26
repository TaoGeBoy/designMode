package com.daitao.State.demo.example;

/**
 * @author 戴涛
 * @Content 状态设计模式测试 (学生成绩)
 * @CreateTime 2021/1/26
 */
public class Demo {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25);
    }
}
