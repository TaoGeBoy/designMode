package com.daitao.Visitor.demo;

/**
 * @author 戴涛
 * @Content 访问者设计模式测试
 * @CreateTime 2021/1/27
 */
public class Demo {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
