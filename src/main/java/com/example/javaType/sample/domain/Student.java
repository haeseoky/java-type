package com.example.javaType.sample.domain;

import java.util.Comparator;

public record Student(String firstName, String lastName, int age) implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Comparator.comparing(Student::firstName)
                    .thenComparing(Student::lastName)
                    .thenComparingInt(Student::age)
                    .compare(o1, o2);
        }
}
