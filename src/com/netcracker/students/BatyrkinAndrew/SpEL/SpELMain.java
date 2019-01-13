package com.netcracker.students.BatyrkinAndrew.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpELMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-spel-config.xml");
        Author author = (Author) context.getBean("person");

        System.out.println(author);
    }
}
