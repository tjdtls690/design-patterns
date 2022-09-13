package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy.practice01;

public class Happy implements EmotionStrategy {
    @Override
    public void emotion() {
        System.out.print("행복한 ");
    }
}
