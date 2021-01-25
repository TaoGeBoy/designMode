package com.daitao.proxy.demo.jdk;

/**
 * @author 戴涛
 * @Content “明星“ 接口实现类
 * @CreateTime 2021/1/25
 */
public class LiuDeHua implements Star {
    public String sing(String name) {
        System.out.println("给我一杯忘情水");
        return "唱完" ;
    }

    public String dance(String name) {
        System.out.println("开心的马骝");
        return "跳完";
    }
}
