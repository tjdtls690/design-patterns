package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice01;

public class BlackShipFactory extends DefaultShipFactory {
    
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
