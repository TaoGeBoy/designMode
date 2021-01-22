package com.daitao.Singleton.demo;

/**
 * @author 戴涛
 * @Content 懒汉式单例模式: 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例
 * @CreateTime 2021/1/22
 */
public class LazySingleton {
    //私有化属性
    private static LazySingleton instatnce;

    //私有化构造函数
    private LazySingleton(){}

    //公开方法获取示例
    public static synchronized LazySingleton getInstance(){
        if(instatnce == null){
            instatnce = new LazySingleton();
        }else{
            System.out.println("单例对象以及创建");
        }
        return instatnce;
    }
}
