package com.example.javaType.generic;

import com.example.javaType.generic.domain.Cage;
import com.example.javaType.generic.domain.Lion;
import com.example.javaType.generic.domain.Meat;
import com.example.javaType.generic.domain.Tiger;
import com.example.javaType.generic.domain.ZooKeeper;
import org.junit.jupiter.api.Test;

public class ZooServiceTest {
    @Test
    void test(){
        ZooKeeper zooKeeper = new ZooKeeper();
        Cage<Tiger> cage = new Cage<>();
        cage.push(new Tiger());
        Meat meat = new Meat();

        zooKeeper.giveMeat(cage, meat);

        Cage<Lion> lionCage = new Cage<>();
        lionCage.push(new Lion());

        zooKeeper.giveMeat(lionCage, meat);
    }

}
