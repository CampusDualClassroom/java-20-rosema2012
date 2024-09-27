package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise20 {


    public static List<Person> getPeopleList() {
        List<Person> l = new ArrayList<>();
        Person p1 = new Person("John", "Smith");
        Person p2 = new Teacher("Maria", "Montesosori", "Educación");
        Person p3 = new PoliceOfficer("Jake","Peralta","B-99");
        Person p4 = new Doctor("Gregory", "House", "Nefrología e infectología");
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        return l;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            stringList.get(i).getDetails();

        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}