package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice02;

public class WhiteHouse extends House {
    public WhiteHouse(HouseDetailsFactory houseDetailsFactory) {
        super("WhiteHouse", "white", houseDetailsFactory);
    }
}
