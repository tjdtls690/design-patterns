package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice02;

public class Client {
    public static void main(String[] args) {
        HouseFactory houseFactory = new WhiteHouseFactory(new GreenHouseDetailsFactory());
        House house = houseFactory.create();
        printHouseInform(house);
    }
    
    private static void printHouseInform(House house) {
        System.out.println(house);
    }
}
