package me.whiteship.designpatterns._01_creational_patterns._01_singleton.practice01;

public class Singleton03 {
    private static volatile Singleton03 instance;
    
    private Singleton03() { }
    
    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                if (instance == null) {
                    instance = new Singleton03();
                }
            }
        }
        
        return instance;
    }
}
