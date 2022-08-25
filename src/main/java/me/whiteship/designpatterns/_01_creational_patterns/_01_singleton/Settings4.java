package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

/**
 * static inner 클래스 홀더
 */
public class Settings4 implements Serializable {

    private Settings4() { }

    private static class Settings4Holder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;
    }
    
    // 직렬화, 역직렬화를 할 때 사용하는 메서드이므로
    // 이 메서드를 이렇게 재정의 해주면
    // 직렬화를 통해 새로운 객체를 만드려 해도 싱글톤을 유지할 수 있다.
    protected Object readResolve() {
        return getInstance();
    }
}
