package com.example.javaType.sample.domain;

import java.util.Comparator;

public record Order(String orderId, String orderDate) implements Comparable<Order> {

    private static final Comparator<Order> COMPARATOR = Comparator.comparing(Order::orderId)
            .thenComparing(Order::orderDate);

    @Override
    public int compareTo(Order o) {
        return COMPARATOR.compare(this, o);
    }
}
