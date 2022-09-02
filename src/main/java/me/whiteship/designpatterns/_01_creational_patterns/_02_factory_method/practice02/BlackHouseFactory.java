package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice02;

public class BlackHouseFactory implements HouseFactory {
    @Override
    public House create() {
        return new BlackHouse();
    }
}
