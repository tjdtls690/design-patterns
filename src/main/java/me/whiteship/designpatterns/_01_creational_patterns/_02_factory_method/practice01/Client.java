package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice01;

public class Client {
    public static void main(String[] args) {
        printShip(new WhiteShipFactory(), "whiteship");
        printShip(new BlackShipFactory(), "blackship");
    }
    
    private static void printShip(ShipFactory shipFactory, String shipName) {
        System.out.println(shipFactory.orderShip(shipName));
    }
}
