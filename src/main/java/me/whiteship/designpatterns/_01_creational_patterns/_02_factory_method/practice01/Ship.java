package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice01;

public class Ship {
    String name;
    String color;
    String logo;
    
    public Ship(String name, String color, String logo) {
        this.name = name;
        this.color = color;
        this.logo = logo;
    }
    
    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
