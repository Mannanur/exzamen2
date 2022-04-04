package com.company.Animal;

public class Animal {
    private String color;
    private int age;
    Animal[]animals;

    public Animal(String color, int age, Animal[] animals) {
        this.color = color;
        this.age = age;
        this.animals = animals;
    }
    public Animal(String color, int age) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
