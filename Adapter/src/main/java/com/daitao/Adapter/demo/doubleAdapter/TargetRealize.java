package com.daitao.Adapter.demo.doubleAdapter;

/**
 * @author 戴涛
 * @Content
 * @CreateTime 2021/1/25
 */
public class TargetRealize implements TwoWayTarget {
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
