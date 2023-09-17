package com.pool;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> numbers= Arrays.asList(508,28,48,26,408,27,3,501);
        var collect = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.groupingBy(num -> num % 2 == 0));
        System.out.println(collect);
    }
}