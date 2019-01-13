package com.netcracker.students.BatyrkinAndrew.di.collects.si;

import com.netcracker.students.BatyrkinAndrew.di.primsObjs.IPlace;

public class MyFamilySI {
    private String familyName;
    private IPlace iPlace;
    private int numOfPeople;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public IPlace getiPlace() {
        return iPlace;
    }

    public void setiPlace(IPlace iPlace) {
        this.iPlace = iPlace;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
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
