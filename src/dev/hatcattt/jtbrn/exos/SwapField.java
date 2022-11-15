package dev.hatcattt.jtbrn.exos;

/**
 * There is a class Person that has two fields: name and age. Your task is to implement the method changeIdentities.
 * It should swap all information (age and name) between two persons p1 and p2.
 * It is known that objects p1 and p2 can't be null.
 */
public class SwapField {
    public static void main(String[] args) {
        System.out.println("Coucou, c'est moi !   ".trim());
    }
}

class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempNameP1 = p1.name;
        int tempAgeP1 = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = tempNameP1;
        p2.age = tempAgeP1;
    }
}