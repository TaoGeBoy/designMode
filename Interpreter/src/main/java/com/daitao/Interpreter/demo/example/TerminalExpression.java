package com.daitao.Interpreter.demo.example;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 戴涛
 * @Content 终结符表达式类
 * @CreateTime 2021/1/27
 */
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();
    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }
    public boolean interpret(String info) {
        if (set.contains(info)) {
            return true;
        }
        return false;
    }
}
