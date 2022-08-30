package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.practice01;

public class WhiteShipFactory implements ShipFactory {
    private final ShipPartsFactory shipPartsFactory;
    
    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }
    
    @Override
    public Ship createShip() {
        return new WhiteShip(shipPartsFactory.getAnchor(), shipPartsFactory.getWheel());
    }
}
