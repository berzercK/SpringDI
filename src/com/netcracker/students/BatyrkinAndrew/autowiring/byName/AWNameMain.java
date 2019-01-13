package com.netcracker.students.BatyrkinAndrew.autowiring.byName;

import com.netcracker.students.BatyrkinAndrew.autowiring.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWNameMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowiring-byName-config.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);
    }
}
