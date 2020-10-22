package com.abubakirov.spring1task1.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("wheel")
public class RoundedWheel implements IWheel {
    @Value("17")
    private int diameter;

    public void whatAreYou() {
        System.out.println("I am a rounded wheel!");
        System.out.println("My diameter is " + diameter + " inches");
    }
}
