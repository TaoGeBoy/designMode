package com.daitao.Adapter.demo.doubleAdapter;

/**
 * @author 戴涛
 * @Content
 * @CreateTime 2021/1/25
 */
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target)
    {
        this.target=target;
    }
    public TwoWayAdapter(TwoWayAdaptee adaptee)
    {
        this.adaptee=adaptee;
    }

    public void specificRequest() {
        target.request();
    }

    public void request() {
        adaptee.specificRequest();
    }
}
