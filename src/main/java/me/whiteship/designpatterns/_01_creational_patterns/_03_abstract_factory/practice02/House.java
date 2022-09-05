package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice02;

public class House {
    private String name;
    private String color;
    private Door door;
    private Wall wall;
    
    public House(String name, String color, HouseDetailsFactory houseDetailsFactory) {
        this.name = name;
        this.color = color;
        this.door = houseDetailsFactory.createDoor();
        this.wall = houseDetailsFactory.createWall();
    }
    
    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", door=" + door.getClass().getSimpleName() +
                ", wall=" + wall.getClass().getSimpleName() +
                '}';
    }
}
