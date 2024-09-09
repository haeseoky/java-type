package com.example.javaType.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class TypeSafeTest {

    static class TypeReference<T> {
        Type type;

        public TypeReference() {
            Type genericSuperclass = getClass().getGenericSuperclass();
            if (genericSuperclass instanceof Class) {
                throw new RuntimeException("Missing type parameter.");
            }
            this.type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        }
    }



    @Test
    void typeSafeTest() {
        TypeSafe typeSafe = new TypeSafe();
        typeSafe.put(String.class, "Hello");
        typeSafe.put(Integer.class, 1);
        typeSafe.put(Class.class, TypeSafe.class);
        typeSafe.put(List.class, List.of(1, 2, 3));
        typeSafe.put(List.class, List.of("a", "b", "c")); // overwrite


        String str = typeSafe.get(String.class);
        Integer integer = typeSafe.get(Integer.class);
        Class<?> aClass = typeSafe.get(Class.class);
        List<?> list = typeSafe.get(List.class);

        System.out.println(str);
        // get str type
        System.out.println(str.getClass());
        System.out.println(integer);

        System.out.println(aClass);
        System.out.println(list);


    }

    static class Sup<T>{
        T value;
    }
    @Test
    void parameterizeType(){
        Sup<List<String>> sup = new Sup<>() {};
        Type genericSuperclass = sup.getClass().getGenericSuperclass();
        System.out.println(genericSuperclass);
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (Type actualTypeArgument : actualTypeArguments) {
            System.out.println(actualTypeArgument);
        }
    }

    private RestTemplate restTemplate;

    @Test
    void ParameterizedTypeTest(){
        ParameterizedTypeReference<List<String>> typeReference = new ParameterizedTypeReference<>() {};

    }
}
