package com.daitao.Singleton.demo;

/**
 * @author 戴涛
 * @Content 饿汉式单例：类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了
 * @CreateTime 2021/1/22
 */
public class HungrySingleton {
    //私有化属性
    private static HungrySingleton instatnce = new HungrySingleton();

    //私有化构造函数
    private HungrySingleton(){}

    //公开方法获取示例
    public static synchronized HungrySingleton getInstance(){
        if(instatnce == null){
            instatnce = new HungrySingleton();
        }else{
            System.out.println("单例对象以及创建");
        }
        return instatnce;
    }
}
