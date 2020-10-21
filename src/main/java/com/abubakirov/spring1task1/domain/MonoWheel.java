package com.abubakirov.spring1task1.domain;

public class MonoWheel {
    private IWheel wheel;

    public void whatAreYou() {
        System.out.println("I am a mono wheel!");
        System.out.println("And this is my wheel:");
        wheel.whatAreYou();
    }

    public void setWheel(IWheel wheel) {
        this.wheel = wheel;
    }

    public IWheel getWheel() {
        return wheel;
    }
}
