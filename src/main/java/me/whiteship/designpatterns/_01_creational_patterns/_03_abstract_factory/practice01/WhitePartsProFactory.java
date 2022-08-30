package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice01;

public class WhitePartsProFactory implements ShipPartsFactory{
    @Override
    public Anchor getAnchor() {
        return new WhiteProAnchor();
    }
    
    @Override
    public Wheel getWheel() {
        return new WhiteProWheel();
    }
}
