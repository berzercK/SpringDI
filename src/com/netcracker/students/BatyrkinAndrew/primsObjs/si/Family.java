package com.netcracker.students.BatyrkinAndrew.primsObjs.si;

import com.netcracker.students.BatyrkinAndrew.primsObjs.IPlace;

public class Family {

    private String familyName;
    private IPlace iPlace;
    private int numOfPeople;

    public String getFamilyName() {
        System.out.println("MyFamily.getFamilyName");
        return familyName;
    }

    public void setFamilyName(String familyName) {
        System.out.println("MyFamily.setFamilyName");
        this.familyName = familyName;
    }

    public IPlace getiPlace() {
        System.out.println("MyFamily.getiPlace");
        return iPlace;
    }

    public void setiPlace(IPlace iPlace) {
        System.out.println("MyFamily.setiPlace");
        this.iPlace = iPlace;
    }

    public int getNumOfPeople() {
        System.out.println("MyFamily.getNumOfPeople");
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        System.out.println("MyFamily.setNumOfPeople");
        this.numOfPeople = numOfPeople;
    }

    @Override
    public String toString() {
        System.out.println("MyFamily.toString");
        return "MyFamily{" +
                "familyName='" + familyName + '\'' +
                ", iPlace=" + iPlace.getClass().getSimpleName() + iPlace.place() +
                ", numOfPeople=" + numOfPeople +
                '}';
//        return super.toString();
    }
}
