package me.whiteship.designpatterns._03_behavioral_patterns._21_strategy.practice01;

public class Robot {
    private MoveStrategy moveStrategy;
    private EmotionStrategy emotionStrategy;
    
    public Robot(MoveStrategy moveStrategy, EmotionStrategy emotionStrategy) {
        this.moveStrategy = moveStrategy;
        this.emotionStrategy = emotionStrategy;
    }
    
    public void robotExplain() {
        moveStrategy.move();
        emotionStrategy.emotion();
        System.out.println("로봇");
    }
    
    public void changeMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }
    
    public void changeEmotionStrategy(EmotionStrategy emotionStrategy) {
        this.emotionStrategy = emotionStrategy;
    }
}
