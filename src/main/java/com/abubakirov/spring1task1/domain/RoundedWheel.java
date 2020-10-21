package com.abubakirov.spring1task1.domain;

import org.springframework.stereotype.Component;

@Component("wheel")
public class RoundedWheel implements IWheel {
    public void whatAreYou() {
        System.out.println("I am a rounded wheel!");
    }
}
