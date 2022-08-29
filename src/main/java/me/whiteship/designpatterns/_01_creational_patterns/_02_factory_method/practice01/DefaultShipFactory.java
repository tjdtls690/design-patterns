package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice01;

public abstract class DefaultShipFactory implements ShipFactory{
    @Override
    public Ship orderShip(String shipName) {
        prepare(shipName);
        Ship ship = createShip();
        createShipSuccess(shipName);
        return ship;
    }
    
    private void createShipSuccess(String shipName) {
        System.out.println(shipName + " 다 만들었습니다.");
    }
    
    private void prepare(String shipName) {
        System.out.println(shipName + " 만들 준비 중");
    }
    
    public abstract Ship createShip();
}
