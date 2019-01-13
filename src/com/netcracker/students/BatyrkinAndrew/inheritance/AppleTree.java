package com.netcracker.students.BatyrkinAndrew.inheritance;

public class AppleTree extends Tree {

    private String woodName;
    private String fruitName;

    public AppleTree(String hasFruit, String woodName, String fruitName) {
        super(hasFruit.equals("yes"));
        System.out.println("AppleTree.AppleTree");
        this.woodName = woodName;
        this.fruitName = fruitName;
        System.out.println("hasFruit = " + hasFruit);
        System.out.println("woodName = " + woodName);
        System.out.println("fruitName = " + fruitName);
    }
}
