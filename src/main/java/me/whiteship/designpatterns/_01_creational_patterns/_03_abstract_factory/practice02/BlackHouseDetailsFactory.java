package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice02;

public class BlackHouseDetailsFactory implements HouseDetailsFactory {
    @Override
    public Door createDoor() {
        return new BlackDoor();
    }
    
    @Override
    public Wall createWall() {
        return new BlackWall();
    }
}
