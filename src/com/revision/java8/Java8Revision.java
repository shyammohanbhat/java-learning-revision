package com.revision.java8;

import java.util.List;
import java.util.stream.IntStream;

public class Java8Revision {

    public static void main(String[] args) {

        //Print numbers from 1 to 10;
        IntStream.rangeClosed(1, 10).forEach(System.out::print);

        System.out.println("------");
        //Convert to integer and print
        List<String> stockText = List.of("7", "13", "42");
        stockText.stream().map(Integer::parseInt)
                .forEach(System.out::println);

        //Print the sum in above list
        System.out.println(stockText.stream().mapToInt(Integer::parseInt).sum());
    }
}
