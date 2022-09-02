package me.whiteship.designpatterns._01_creational_patterns._02_factory_method.practice03;

public class HouseFactory {
    public static House from(String houseName) throws IllegalArgumentException{
        if (houseName.equals("WhiteHouse")) {
            return new WhiteHouse();
        }
        
        if (houseName.equals("BlackHouse")) {
            return new BlackHouse();
        }
        
        throw new IllegalArgumentException("해당 제품이 존재하지 않습니다.");
    }
}
