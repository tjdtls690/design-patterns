package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy.practice01;

public class Stand implements MoveStrategy {
    @Override
    public void move() {
        System.out.print("서있는 ");
    }
}
