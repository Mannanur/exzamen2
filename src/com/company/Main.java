package com.company;

import com.company.Animal.*;
import com.company.Person.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Tilek");

        Cat cat = new Cat("blue", 2);
        Cat cat1 = new Cat("blak", 3);
        Dog dog = new Dog("sary", 2);
        Dog dog1 = new Dog("kara", 3);
        Cow cow = new Cow("targyl", 4);
        Cow cow1 = new Cow("ak", 3);
        Animal[] animals = new Animal[]{cow, cow1, cat, cat1, dog, dog1};
        Ferma ferma = new Ferma(person, animals);

ferma.aty("Tilek");
    }

}
