package com.netcracker.students.BatyrkinAndrew.inheritance;

public class BirchTree extends Tree {
    private String woodName;

    public BirchTree(String hasFruit, String woodName) {
        super(hasFruit.equals("yes"));
        System.out.println("BirchTree.BirchTree");
        this.woodName = woodName;
        System.out.println("hasFruit = " + hasFruit);
        System.out.println("woodName = " + woodName);
    }
}
