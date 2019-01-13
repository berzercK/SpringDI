package com.netcracker.students.BatyrkinAndrew.lookupMInj;

import java.util.concurrent.atomic.AtomicLong;

public class Pizza {
    private static AtomicLong count = new AtomicLong(0);
    private boolean isVeggie;

    public Pizza() {
        System.out.println("Pizza.Pizza");
        count.incrementAndGet();
    }

    public void setVeggie(boolean veggie) {
        System.out.println("Pizza.setVeggie");
        isVeggie = veggie;
        System.out.println("veggie = [" + veggie + "]" + ", count = {" + count + "]");
    }

    @Override
    public String toString() {
        return "A new " + (isVeggie ? "veggie" : "")
                + "Pizza is ready! Count(" + count.get() + ")";
    }
}
