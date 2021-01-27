package com.daitao.Iterator.demo;

/**
 * @author 戴涛
 * @Content 抽象迭代器
 * @CreateTime 2021/1/27
 */
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
