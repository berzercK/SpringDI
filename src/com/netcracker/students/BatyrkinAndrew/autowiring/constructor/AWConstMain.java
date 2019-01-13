package com.netcracker.students.BatyrkinAndrew.autowiring.constructor;

import com.netcracker.students.BatyrkinAndrew.autowiring.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWConstMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowiring-constructor-config.xml");
        System.out.println("Constuctor Autowiring");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
    }
}
