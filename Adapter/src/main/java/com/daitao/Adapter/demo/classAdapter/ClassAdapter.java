package com.daitao.Adapter.demo.classAdapter;

/**
 * @author 戴涛
 * @Content 它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * @CreateTime 2021/1/25
 */
public class ClassAdapter extends Adaptee implements Target{
    public void request() {
        specificRequest();
    }
}
