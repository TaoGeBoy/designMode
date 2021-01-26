package com.daitao.State.demo.example;

/**
 * @author 戴涛
 * @Content 具体状态类：不及格
 * @CreateTime 2021/1/26
 */
public class LowState extends AbstractState {
    public LowState(ScoreContext h) {
        hj = h;
        stateName = "不及格";
        score = 0;
    }
    public LowState(AbstractState state) {
        hj = state.hj;
        stateName = "不及格";
        score = state.score;
    }
    public void checkState() {
        if (score >= 90) {
            hj.setState(new HighState(this));
        } else if (score >= 60) {
            hj.setState(new MiddleState(this));
        }
    }
}
