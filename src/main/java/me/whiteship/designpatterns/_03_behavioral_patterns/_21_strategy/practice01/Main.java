package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy.practice01;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Walking(), new Angry());
        robot.robotExplain();
        robot.changeMoveStrategy(new Running());
        robot.robotExplain();
        robot.changeEmotionStrategy(new Happy());
        robot.changeMoveStrategy(new Stand());
        robot.robotExplain();
    }
}
