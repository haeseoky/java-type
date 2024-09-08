package com.example.javaType.generic.domain;

public class ZooKeeper {

    public void giveMeat(Cage<? extends Carnivore> cage, Meat m) {
        Carnivore animal = cage.pop();
        animal.eatMeat(m);
    }

}
