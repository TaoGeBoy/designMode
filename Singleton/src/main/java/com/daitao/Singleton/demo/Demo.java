package com.daitao.Singleton.demo;

/**
 * @author 戴涛
 * @Content 测试
 * @CreateTime 2021/1/22
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance().hashCode());
        System.out.println(LazySingleton.getInstance().hashCode());
        System.out.println(HungrySingleton.getInstance().hashCode());
        System.out.println(HungrySingleton.getInstance().hashCode());

        for(int i = 0; i < 10; i++){
            System.out.println(Multitcm.getInstance(10).hashCode());
        }

    }
}

