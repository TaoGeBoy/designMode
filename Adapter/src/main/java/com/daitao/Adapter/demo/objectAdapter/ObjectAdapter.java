package com.daitao.Adapter.demo.objectAdapter;

/**
 * @author 戴涛
 * @Content
 * @CreateTime 2021/1/25
 */
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee)
    {
        this.adaptee=adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
