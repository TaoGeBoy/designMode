package com.daitao.proxy.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 戴涛
 * @Content “明星“ 代理类
 * @CreateTime 2021/1/25
 */
public class StarProxy implements InvocationHandler {
    private Object target;

    public void setTarget(Object target)
    {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这里可以做增强
        System.out.println("收钱");
        Object result = method.invoke(target, args);
        return result;

    }

    // 生成代理类
    public Object CreatProxyedObj()
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
