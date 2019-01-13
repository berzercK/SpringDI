package com.netcracker.students.BatyrkinAndrew.di.collects.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsCIMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-di-ci-collections-config.xml");

        FamilyCollections familyCollections = (FamilyCollections) context.getBean("familyCollections");

        System.out.println(familyCollections);


    }
}
