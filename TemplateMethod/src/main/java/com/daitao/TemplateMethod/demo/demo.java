package com.daitao.TemplateMethod.demo;

/**
 * @author 戴涛
 * @Content 模板方法设计模式测试
 * @CreateTime 2021/1/26
 */
public class demo {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
