package com.daitao.Observer.demo.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 戴涛
 * @Content 抽象目标：汇率
 * @CreateTime 2021/1/27
 */
abstract class Rate {
    protected List<Company> companys = new ArrayList<Company>();
    //增加观察者方法
    public void add(Company company) {
        companys.add(company);
    }
    //删除观察者方法
    public void remove(Company company) {
        companys.remove(company);
    }
    public abstract void change(int number);
}
