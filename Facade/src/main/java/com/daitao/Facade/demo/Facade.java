package com.daitao.Facade.demo;

/**
 * @author 戴涛
 * @Content 外观角色
 * @CreateTime 2021/1/25
 */
public class Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
