package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order("Sattenapalle", "Dinesh", "Kandimalla", "dk@gmail.com"),
                new Order("Sirsapalle", "Kavya", "kallepu", "kk@gmail.com"),
                new Order("Bhimavaram", "Bary", "Konda", "baryk@gmail.com"),
                new Order("Punjab", "Arshdeep", "kaur", "arsh@gmail.com"))
                .collect(Collectors.toList());
    }
}
