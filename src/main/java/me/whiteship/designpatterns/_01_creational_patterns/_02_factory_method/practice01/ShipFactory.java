package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice01;

public interface ShipFactory {
    Ship orderShip(String shipName);
    Ship createShip();
}
