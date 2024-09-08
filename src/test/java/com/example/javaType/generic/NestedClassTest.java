package com.example.javaType.generic;

public class NestedClassTest {
    private String name;

    public static class StaticNestedClass {
        private String nestedName;

        public void test(){
            // static인 경우 바깥 클래스의 멤버변수에 접근할 수 없다.
            // System.out.println(name); // error

        }
    }

    public class InnerClass {
        private String innerName;

        public void test(){
            // inner class인 경우 바깥 클래스의 멤버변수에 접근할 수 있다.
            System.out.println(name);
        }
    }

}
