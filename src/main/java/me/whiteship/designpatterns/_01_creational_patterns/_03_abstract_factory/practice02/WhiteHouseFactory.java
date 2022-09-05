package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice02;

public class WhiteHouseFactory implements HouseFactory {
    private final HouseDetailsFactory houseDetailsFactory;
    
    public WhiteHouseFactory(HouseDetailsFactory houseDetailsFactory) {
        this.houseDetailsFactory = houseDetailsFactory;
    }
    
    @Override
    public House create() {
        return new WhiteHouse(houseDetailsFactory);
    }
}
