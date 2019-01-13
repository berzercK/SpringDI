package com.netcracker.students.BatyrkinAndrew.di.collects.si;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FamilyCollectionsSI {

    private List<MyFamilySI> myFamilyList;
    private Set<MyFamilySI> myFamilySet;
    private Map<String, MyFamilySI> personMap;

    @Override
    public String toString() {
        System.out.println("FamilyCollectionsSI.toString: ");
        return "FamilyCollectionsSI{" + '\n' +
                '\t' +"myFamilyList=" + '\n' + myFamilyList + '\n' +
                '\t' +"myFamilySet=" + '\n' + myFamilySet + '\n' +
                '\t' +"personMap=" + '\n' + personMap +
                '}' + '\n';
    }

    public List<MyFamilySI> getMyFamilyList() {
        System.out.println("FamilyCollectionsSI.getMyFamilyList");
        return myFamilyList;
    }

    public void setMyFamilyList(List<MyFamilySI> myFamilyList) {
        System.out.println("FamilyCollectionsSI.setMyFamilyList");
        this.myFamilyList = myFamilyList;
    }

    public Set<MyFamilySI> getMyFamilySet() {
        System.out.println("FamilyCollectionsSI.getMyFamilySet");
        return myFamilySet;
    }

    public void setMyFamilySet(Set<MyFamilySI> myFamilySet) {
        System.out.println("FamilyCollectionsSI.setMyFamilySet");
        this.myFamilySet = myFamilySet;
    }

    public Map<String, MyFamilySI> getPersonMap() {
        System.out.println("FamilyCollectionsSI.getPersonMap");
        return personMap;
    }

    public void setPersonMap(Map<String, MyFamilySI> personMap) {
        System.out.println("FamilyCollectionsSI.setPersonMap");
        this.personMap = personMap;
    }
}
