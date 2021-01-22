package com.daitao.Prototype.demo.PrototypeManager;

/**
 * @author 戴涛
 * @Content 图形具体接口
 * @CreateTime 2021/1/22
 */
public interface Shape extends Cloneable{
    //获取图形面积
    public void countArea();

    //拷贝方法
    public Object clone();
}
