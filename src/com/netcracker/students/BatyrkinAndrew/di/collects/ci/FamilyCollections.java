package com.netcracker.students.BatyrkinAndrew.di.collects.ci;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FamilyCollections {

    private List<MyFamily> myFamilyList;
    private Set<MyFamily> myFamilySet;
    private Map<String, MyFamily> personMap;

    public FamilyCollections(List<MyFamily> myFamilyList, Set<MyFamily> myFamilySet, Map<String, MyFamily> personMap) {
        System.out.println("Create FamilyCollections.FamilyCollections");
        this.myFamilyList = myFamilyList;
        this.myFamilySet = myFamilySet;
        this.personMap = personMap;
    }

    @Override
    public String toString() {
        System.out.println("FamilyCollections.toString: ");
        return "FamilyCollections{" + '\n' +
                "myFamilyList=" + '\n' + myFamilyList + '\n' +
                ", myFamilySet=" + '\n' + myFamilySet + '\n' +
                ", personMap=" + '\n' + personMap +
                '}' + '\n';
    }
}
