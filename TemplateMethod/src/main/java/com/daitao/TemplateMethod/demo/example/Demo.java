package com.daitao.TemplateMethod.demo.example;

/**
 * @author 戴涛
 * @Content 模板方法设计模式测试（美国留学案例）
 * @CreateTime 2021/1/26
 */
public class Demo {
    public static void main(String[] args) {
        StudyAbroad studyInAmerica = new StudyInAmerica();
        studyInAmerica.TemplateMethod();
    }
}
