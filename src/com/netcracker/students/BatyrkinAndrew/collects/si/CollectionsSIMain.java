package com.netcracker.students.BatyrkinAndrew.collects.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsSIMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-di-si-collections-config.xml");

        FamilyCollectionsSI collectionsSI = (FamilyCollectionsSI) context.getBean("familyCollectionsSI");

        System.out.println(collectionsSI);
    }
}
