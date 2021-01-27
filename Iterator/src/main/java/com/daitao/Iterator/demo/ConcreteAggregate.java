package com.daitao.Iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 戴涛
 * @Content 具体聚合
 * @CreateTime 2021/1/27
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();
    public void add(Object obj) {
        list.add(obj);
    }
    public void remove(Object obj) {
        list.remove(obj);
    }
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
