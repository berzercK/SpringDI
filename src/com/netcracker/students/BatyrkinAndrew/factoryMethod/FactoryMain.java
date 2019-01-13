package com.netcracker.students.BatyrkinAndrew.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-factory-config.xml");
        MyFactory factory = (MyFactory) context.getBean("myFactory");
    }
}
