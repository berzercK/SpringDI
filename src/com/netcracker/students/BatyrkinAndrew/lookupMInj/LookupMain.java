package com.netcracker.students.BatyrkinAndrew.lookupMInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-lookup-config.xml");
        MyPizzaShop pizzaShop = (MyPizzaShop) context.getBean("pizzaShop");

        Pizza firstPizza = pizzaShop.makePizza();
        System.out.println("firstPizza = " + firstPizza);

        Pizza secondPizza = pizzaShop.makeVeggiePizza();
        System.out.println("secondPizza = " + secondPizza);

        Pizza thirdPizza = pizzaShop.makePizza();
        System.out.println("thirdPizza = " + thirdPizza);

    }
}
