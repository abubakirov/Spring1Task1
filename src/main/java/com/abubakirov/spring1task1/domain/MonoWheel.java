package com.abubakirov.spring1task1.domain;

public class MonoWheel {
    private String model;
    private IWheel wheel;

    public MonoWheel(String model) {
        this.model = model;
    }

    public void whatAreYou() {
        System.out.println("I am a mono wheel!");
        System.out.println("My model name is: " + model);
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
