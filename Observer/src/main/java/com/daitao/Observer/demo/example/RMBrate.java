package com.daitao.Observer.demo.example;

/**
 * @author 戴涛
 * @Content 具体目标：人民币汇率
 * @CreateTime 2021/1/27
 */
public class RMBrate extends Rate {
    public void change(int number) {
        for (Company obs : companys) {
            ((Company) obs).response(number);
        }
    }
}
