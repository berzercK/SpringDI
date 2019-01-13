package com.netcracker.students.BatyrkinAndrew.collects.ci;

import com.netcracker.students.BatyrkinAndrew.primsObjs.IPlace;

import java.beans.ConstructorProperties;

public class MyFamily {
    private String familyName;
    private IPlace iPlace;
    private int numOfPeople;

    @ConstructorProperties({"familyName", "iPlace", "numOfPeople"})
    public MyFamily(String familyName, IPlace iPlace, int numOfPeople) {
        System.out.println("Create MyFamily.MyFamily...");
        this.familyName = familyName;
        this.iPlace = iPlace;
        this.numOfPeople = numOfPeople;
        System.out.println("Complete MyFamily.MyFamily\n");
    }

    @Override
    public String toString() {
        System.out.println("MyFamily.toString:");
        return "MyFamily{" +
                "familyName='" + familyName + '\'' +
                ", iPlace=" /*+ iPlace.getClass().getSimpleName()*/ + iPlace.place() +
                ", numOfPeople=" + numOfPeople +
                "}" + '\n';
//        return super.toString();
    }
}
