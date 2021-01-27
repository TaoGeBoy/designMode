package com.daitao.Interpreter.demo.example;

/**
 * @author 戴涛
 * @Content 解释器设计模式测试 （公交卡案例）
 * @CreateTime 2021/1/27
 */
public class Demo {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}
