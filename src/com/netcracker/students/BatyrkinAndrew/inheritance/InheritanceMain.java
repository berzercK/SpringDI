package com.netcracker.students.BatyrkinAndrew.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-inheritance-config.xml");

        BirchTree birch = (BirchTree) context.getBean("birch");
        AppleTree apple = (AppleTree) context.getBean("apple");

        System.out.println("apple = " + apple.hasFruit);
        System.out.println("birch = " + birch.hasFruit);
    }


}
