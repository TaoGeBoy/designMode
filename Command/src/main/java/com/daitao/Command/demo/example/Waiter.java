package com.daitao.Command.demo.example;

/**
 * @author 戴涛
 * @Content 调用者：服务员
 * @CreateTime 2021/1/26
 */
public class Waiter {
    private Breakfast changFen, hunTun, heFen;
    public void setChangFen(Breakfast f) {
        changFen = f;
    }
    public void setHunTun(Breakfast f) {
        hunTun = f;
    }
    public void setHeFen(Breakfast f) {
        heFen = f;
    }
    public void chooseChangFen() {
        changFen.cooking();
    }
    public void chooseHunTun() {
        hunTun.cooking();
    }
    public void chooseHeFen() {
        heFen.cooking();
    }
}
