package com.daitao.Decorator.demo;

/**
 * @author 戴涛
 * @Content 具体构件角色
 * @CreateTime 2021/1/25
 */
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }
    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}
