package com.example.javaType.generic.domain;

import java.util.List;

public class Cage<T extends Carnivore> {
    List<T> animals;

    public void push(T newAnimal){
       animals.add(newAnimal);

    }

    public T pop() {
        T animal = animals.removeFirst();
        animals.addLast(animal);
        return animal;
    }
}