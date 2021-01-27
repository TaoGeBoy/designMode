package com.daitao.Observer.demo.example;

/**
 * @author 戴涛
 * @Content 监听者设计模式（汇率监听）
 * @CreateTime 2021/1/27
 */
public class Demo {
    public static void main(String[] args) {
        Rate rate = new RMBrate();
        Company watcher1 = new ImportCompany();
        Company watcher2 = new ExportCompany();
        rate.add(watcher1);
        rate.add(watcher2);
        rate.change(10);
        rate.change(-9);
    }
}
