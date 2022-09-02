package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice03;

public class House {
    private String name;
    private String color;
    
    public House(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
