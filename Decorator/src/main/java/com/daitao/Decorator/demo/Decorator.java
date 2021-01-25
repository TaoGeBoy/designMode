package com.daitao.Decorator.demo;

/**
 * @author 戴涛
 * @Content 抽象装饰角色
 * @CreateTime 2021/1/25
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }
    public void operation() {
        component.operation();
    }
}
