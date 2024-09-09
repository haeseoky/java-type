package com.example.javaType.generic;

import java.util.HashMap;
import java.util.Map;

public class TypeSafe {

    // type token
    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> clazz, T value) {
        map.put(clazz, value);
    }

    public <T> T get(Class<T> clazz) {
        return clazz.cast(map.get(clazz));
    }

}
