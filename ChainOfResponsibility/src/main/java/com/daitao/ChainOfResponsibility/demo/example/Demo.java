package com.daitao.ChainOfResponsibility.demo.example;

/**
 * @author 戴涛
 * @Content 责任链设计模式测试 (请求流程)
 * @CreateTime 2021/1/26
 */
public class Demo {
    public static void main(String[] args) {
        //组装责任链
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();
        //Leader teacher4=new DeanOfStudies();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        //teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(8);
    }
}
