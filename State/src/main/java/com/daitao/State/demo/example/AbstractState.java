package com.daitao.State.demo.example;

/**
 * @author 戴涛
 * @Content 抽象状态类
 * @CreateTime 2021/1/26
 */
abstract class AbstractState {
    protected ScoreContext hj;  //环境
    protected String stateName; //状态名
    protected int score; //分数
    public abstract void checkState(); //检查当前状态
    public void addScore(int x) {
        score += x;
        System.out.print("加上：" + x + "分，\t当前分数：" + score);
        checkState();
        System.out.println("分，\t当前状态：" + hj.getState().stateName);
    }
}
