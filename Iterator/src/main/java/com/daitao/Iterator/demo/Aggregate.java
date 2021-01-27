package com.daitao.Iterator.demo;

/**
 * @author 戴涛
 * @Content 抽象聚合
 * @CreateTime 2021/1/27
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
