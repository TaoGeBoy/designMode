package com.daitao.Adapter.demo.objectAdapter;

/**
 * @author 戴涛
 * @Content 适配者接口： 它是被访问和适配的现存组件库中的组件接口。
 * @CreateTime 2021/1/25
 */
public class Adaptee {
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}
