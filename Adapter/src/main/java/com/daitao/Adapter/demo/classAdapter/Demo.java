package com.daitao.Adapter.demo.classAdapter;

/**
 * @author 戴涛
 * @Content 类适配器模式测试
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
