package com.netcracker.students.BatyrkinAndrew.autowiring.byType;

import com.netcracker.students.BatyrkinAndrew.autowiring.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWTypeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowiring-byType-config.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
    }
}
