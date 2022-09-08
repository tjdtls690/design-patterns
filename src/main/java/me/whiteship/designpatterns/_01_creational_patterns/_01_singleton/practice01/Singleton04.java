package me.whiteship.designpatterns._01_creational_patterns._01_singleton.practice01;

public class Singleton04 {
    private static final Singleton04 INSTANCE = new Singleton04();
    
    private Singleton04() { }
    
    public static Singleton04 getInstance() {
        return INSTANCE;
    }
}
