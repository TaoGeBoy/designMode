package com.daitao.builderPattern.demo;

/**
 * @author 戴涛
 * @Content 产品：客厅
 * @CreateTime 2021/1/22
 */
public class Parlour {
    private String wall;    //墙
    private String TV;    //电视
    private String sofa;    //沙发
    public void setWall(String wall) {
        this.wall = wall;
    }
    public void setTV(String TV) {
        this.TV = TV;
    }
    public void setSofa(String sofa) {
        this.sofa = sofa;
    }
    public void show() {
        System.out.println(wall + TV + sofa);
    }
}
