package com.abubakirov.spring1task1.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wheel")
@Scope("prototype")
public class RoundedWheel implements IWheel {
    @Value("17")
    private int diameter;

    @Autowired
    @Qualifier("id")
    private Id id;

    public void whatAreYou() {
        System.out.println("I am a rounded wheel!");
        System.out.println("My id is " + id.getId());
        System.out.println("My diameter is " + diameter + " inches");
    }
}
