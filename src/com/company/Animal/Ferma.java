package com.company.Animal;

import com.company.Person.Person;

public class Ferma {
    Person person;
    Animal[]animals;

    public Ferma(Person person, Animal[] animals) {
        this.person = person;
        this.animals = animals;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public void aty(String at){
        int count =0;
        int count1 = 0;
        int count2 = 0;
        if (at.equals(getPerson().getName())) {
            for (Animal animal : animals) {
              if (animal instanceof Cat){
                  count++;
              }
              else if (animal instanceof Dog){
                  count1++;
              }
                else if(animal instanceof Cow){
                    count2++;
                }
            }
            System.out.println(at+"tin "+count+"-myshygy , "+ count1+" - Maly , "+count2+" - iti bar.");
        }
        else {
            System.out.println("myndai chaban jok");
        }
    }
}