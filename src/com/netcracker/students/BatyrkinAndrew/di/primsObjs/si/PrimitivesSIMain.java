package com.netcracker.students.BatyrkinAndrew.di.primsObjs.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimitivesSIMain {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-di-si-prim-config.xml");

        Family firstFamily = (Family) context.getBean("batyrkin");
        Family secondFamily = (Family) context.getBean("akimov");

        System.out.println("firstFamily = " + firstFamily);
        System.out.println("secondFamily = " + secondFamily);



    }
}
