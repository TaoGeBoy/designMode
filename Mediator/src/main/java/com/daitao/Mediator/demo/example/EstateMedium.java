package com.daitao.Mediator.demo.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 戴涛
 * @Content 具体中介者：房地产中介
 * @CreateTime 2021/1/27
 */
public class EstateMedium implements Medium {
    private List<Customer> members = new ArrayList<Customer>();
    public void register(Customer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }
    public void relay(String from, String ad) {
        for (Customer ob : members) {
            String name = ob.getName();
            if (!name.equals(from)) {
                ((Customer) ob).receive(from, ad);
            }
        }
    }
}
