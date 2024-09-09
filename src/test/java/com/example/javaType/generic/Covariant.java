package com.example.javaType.generic;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Covariant {
    @Test
    void test(){
        // 공변 array가능
        Object[] objects = new Long[10];

    }

    @Test
    <T> void test2(){
        //
        // List<Object> objects = new ArrayList<Long>();
    }

}
