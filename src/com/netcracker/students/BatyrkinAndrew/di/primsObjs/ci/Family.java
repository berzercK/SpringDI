package com.netcracker.students.BatyrkinAndrew.di.primsObjs.ci;

import com.netcracker.students.BatyrkinAndrew.di.primsObjs.IPlace;

public class Family {

    private String familyName;
    private IPlace iPlace;
    private int numOfPeople;

    public Family(String familyName, IPlace iPlace, int numOfPeople) {
        System.out.println("MyFamily.MyFamily");
        this.familyName = familyName;
        this.iPlace = iPlace;
        this.numOfPeople = numOfPeople;
    }

    @Override
    public String toString() {
        return "MyFamily{" +
                "familyName='" + familyName + '\'' +
                ", iPlace=" + iPlace.getClass().getSimpleName() + iPlace.place() +
                ", numOfPeople=" + numOfPeople +
                '}';
//        return super.toString();
    }
}
