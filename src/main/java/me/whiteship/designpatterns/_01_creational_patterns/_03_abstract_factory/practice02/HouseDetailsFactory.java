package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice02;

public interface HouseDetailsFactory {
    Door createDoor();
    
    Wall createWall();
}
