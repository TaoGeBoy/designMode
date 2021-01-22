package com.daitao.Singleton.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 戴涛
 * @Content 由单例模式衍生出来的多例模式
 * @CreateTime 2021/1/22
 */
public class Multitcm {
    private static List<Multitcm> instance;

    private Multitcm(){}

    public static synchronized Multitcm getInstance(int num){
        if(instance == null){
            instance = new ArrayList<Multitcm>();
            for(int i = 0; i < num; i++){
                instance.add(new Multitcm());
            }
        }
        Random random = new Random();
        int Max = instance.size();
        int min = 0;
        int i = random.nextInt(Max) % (Max - min + 1) + min;
        return instance.get(i);
    }


}
