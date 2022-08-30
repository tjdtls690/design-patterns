package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice01;

public class WhitePartsFactory implements ShipPartsFactory {
    
    @Override
    public Anchor getAnchor() {
        return new WhiteAnchor();
    }
    
    @Override
    public Wheel getWheel() {
        return new WhiteWheel();
    }
}
