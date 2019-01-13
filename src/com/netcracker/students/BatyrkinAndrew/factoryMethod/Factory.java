package com.netcracker.students.BatyrkinAndrew.factoryMethod;

public class Factory {
    private static Factory factory = new Factory();
    private static MyFactory myFactory = new MyFactory();

    public Factory() {
    }

    public static Factory getFactory() {
        return factory;
    }

    public MyFactory getMyFactory() {
        return myFactory;
    }
}
