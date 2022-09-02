package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice03;

public class Client {
    public static void main(String[] args) {
        printHouseInform(HouseFactory.from("WhiteHouse"));
        printHouseInform(HouseFactory.from("BlackHouse"));
    }
    
    private static void printHouseInform(House house) {
        System.out.println(house);
    }
}
