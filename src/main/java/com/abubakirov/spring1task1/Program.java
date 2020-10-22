package com.abubakirov.spring1task1;

import com.abubakirov.spring1task1.Configs.JavaConfig;
import com.abubakirov.spring1task1.domain.MonoWheel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("config.xml");
        MonoWheel monoWheel1 = xmlContext.getBean("monoWheel", MonoWheel.class);
        monoWheel1.whatAreYou();

        System.out.println();
        System.out.println();

        ApplicationContext javaContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        MonoWheel monoWheel2 = javaContext.getBean("monoWheel", MonoWheel.class);
        monoWheel2.whatAreYou();

        System.out.println();
        System.out.println();

        MonoWheel monoWheel3 = javaContext.getBean("monoWheel", MonoWheel.class);
        monoWheel3.whatAreYou();
    }
}
