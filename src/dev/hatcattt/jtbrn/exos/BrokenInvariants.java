package dev.hatcattt.jtbrn.exos;

class BrokenInvariants {
    public static void main(String[] args) {
        Cat casper = new Cat("Casper", -1);
        Dog dog = new Dog("Casper", -1);

        // run java -ea BrokenInvariants.java
    }
}

class Dog {
    String name;
    int age;
    public Dog(String name, int age) {
        assert (age >= 0) : "Invalid age!";
        this.name = name;
        this.age = age;
    }
}

class Cat {
    String name;
    int age;
    public Cat(String name, int age) {
        assert (age >= 0) : "Invalid age!";
        this.name = name;
        this.age = age;
    }
}
