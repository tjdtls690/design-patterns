package me.whiteship.designpatterns._01_creational_patterns._01_singleton.practice01;

public class Main {
    public static void main(String[] args) {
        Singleton05 singleton05_1 = Singleton05.getInstance();
        Singleton05 singleton05_2 = Singleton05.getInstance();
        System.out.println(singleton05_1 == singleton05_2);
    }
}
