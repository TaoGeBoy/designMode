package com.daitao.Adapter.demo.doubleAdapter;

/**
 * @author 戴涛
 * @Content
 * @CreateTime 2021/1/25
 */
public class AdapteeRealize implements TwoWayAdaptee {
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
