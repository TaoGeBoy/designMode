package com.daitao.State.demo;

/**
 * @author 戴涛
 * @Content 状态设计模式测试
 * @CreateTime 2021/1/26
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
