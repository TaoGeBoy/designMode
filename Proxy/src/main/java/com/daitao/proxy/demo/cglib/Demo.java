package com.daitao.proxy.demo.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author 戴涛
 * @Content Cglib动态代理测试
 * @CreateTime 2021/1/25
 */
public class Demo {
    public static void main(String[] args) {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(Dog.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());

        //这里的creat方法就是正式创建代理类
        Dog proxyDog = (Dog)enhancer.create();
        //调用代理类的eat方法
        proxyDog.eat();
    }
}
