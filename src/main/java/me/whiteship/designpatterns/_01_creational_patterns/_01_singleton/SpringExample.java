package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        // 엄밀히 싱글톤 패턴과는 다른 개념이다.
        // ApplicationContext 안에서 유일한 인스턴스로 관리해주는 것 뿐이다.
        // 스프링에서 싱글톤을 써야하는 경우 빈을 싱글톤 스코프로 설정해서 사용한다.
        
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello2);
        System.out.println(hello);
        System.out.println(hello2);
    }

}
