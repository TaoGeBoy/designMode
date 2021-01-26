package com.daitao.State.demo;

/**
 * @author 戴涛
 * @Content 抽象状态类
 * @CreateTime 2021/1/26
 */
abstract class State {
    public abstract void Handle(Context context);
}
