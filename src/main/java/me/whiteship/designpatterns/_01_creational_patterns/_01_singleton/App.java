package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // enum
//        Settings5 settings = Settings5.INSTANCE;
        
        // static inner holder class
        Settings4 settings = Settings4.getInstance();
        
        // enum
        // 1. 직렬화 역직렬화로부터 싱글톤을 보호한다.
        // 2. 리플랙션의 Constructor 의 사용을 애초에 막아준다.
        
        // static inner holder class
        // 1. 직렬화, 역직렬화할 때 사용되는 protected Object readResolve() 메서드를
        //    재정의 해줌으로써 싱글톤을 보호한다.
        // 2. 그러나 리플렉션까지 막지는 못한다.
        
        // 가장 안전한 방법은 enum
        // 그러나 상속을 받아야하거나 지연초기화를 사용해야할 때는 static inner holder class
        
        // 결론
        // 가장 무난한 방법은 static inner holder class
        
        
        // 직렬화 역직렬화 테스트
        Settings4 settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }
        
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings4) in.readObject();
        }

        System.out.println(settings == settings1);
    }
}
