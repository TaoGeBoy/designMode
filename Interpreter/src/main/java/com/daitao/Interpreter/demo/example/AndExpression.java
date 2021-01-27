package com.daitao.Interpreter.demo.example;

/**
 * @author 戴涛
 * @Content 非终结符表达式类
 * @CreateTime 2021/1/27
 */
public class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;
    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }
    public boolean interpret(String info) {
        String s[] = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
