package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice02;

public class Client {
    public static void main(String[] args) {
        printHouseInform(new WhiteHouseFactory());
        printHouseInform(new BlackHouseFactory());
    }
    
    private static void printHouseInform(HouseFactory houseFactory) {
        System.out.println(houseFactory.create());
    }
}
