package com.daitao.State.demo.example;

/**
 * @author 戴涛
 * @Content 具体状态类：优秀
 * @CreateTime 2021/1/26
 */
public class HighState extends AbstractState {
    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score;
    }
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this));
        }
    }
}
