package com.daitao.Visitor.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 戴涛
 * @Content 对象结构角色
 * @CreateTime 2021/1/27
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();
    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }
    public void add(Element element) {
        list.add(element);
    }
    public void remove(Element element) {
        list.remove(element);
    }
}
