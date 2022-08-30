package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice01;

public class Ship {
    private final Anchor anchor;
    private final Wheel wheel;
    
    public Ship(Anchor anchor, Wheel wheel) {
        this.anchor = anchor;
        this.wheel = wheel;
    }
    
    public Anchor getAnchor() {
        return anchor;
    }
    
    public Wheel getWheel() {
        return wheel;
    }
}
