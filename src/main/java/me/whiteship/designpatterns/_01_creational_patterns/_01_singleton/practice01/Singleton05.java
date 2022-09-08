package me.whiteship.designpatterns._01_creational_patterns._01_singleton.practice01;

public class Singleton05 {
    private static class Singleton05HolderClass {
        private static final Singleton05 INSTANCE = new Singleton05();
    }
    
    public static Singleton05 getInstance() {
        return Singleton05HolderClass.INSTANCE;
    }
}
