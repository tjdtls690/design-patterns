package me.whiteship.designpatterns._01_creational_patterns._01_singleton.practice01;

public class Singleton02 {
    private static Singleton02 instance;
    
    private Singleton02() { }
    
    public static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}
