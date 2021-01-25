package com.daitao.Adapter.demo.objectAdapter;

/**
 * @author 戴涛
 * @Content 对象适配器模式测试
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}

