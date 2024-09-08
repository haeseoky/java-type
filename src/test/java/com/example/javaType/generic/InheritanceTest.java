package com.example.javaType.generic;

import com.example.javaType.generic.domain.CompositionInstrumentedHashSet;
import com.example.javaType.generic.domain.InstrumentedHashSet;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.Test;

public class InheritanceTest {

    @Test
    void inheritanceTest(){
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount()); // 6이 반환?
    }

    @Test
    void compositionTest(){
        CompositionInstrumentedHashSet<String> s = new CompositionInstrumentedHashSet<>(new HashSet<>());
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount()); // 6이 반환?
    }
}
