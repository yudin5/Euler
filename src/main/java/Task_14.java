package net.projecteuler.euler.src.main.java;


import java.util.OptionalLong;
import java.util.function.LongUnaryOperator;
import java.util.stream.LongStream;

/**
 * Longest Collatz sequence
 * Отправить
 * <p>
 * Show HTML problem content
 * Problem 14
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <p>
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 * <p>
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Task_14 {
    public static void main(String[] args) {

        LongUnaryOperator sequence = value -> {
            if (value % 2 == 0) {
                return (value / 2);
            }
            return (value * 3 + 1);
        };

        int initialValue = 13;
        long count = LongStream.iterate(initialValue, value -> value != 1, sequence)
                .count();
//                .forEach(System.out::println);
        System.out.println("count = " + count);


        OptionalLong maxNumbers = LongStream.rangeClosed(1, 1000000)
                .map(startValue -> {
                    long numbersQuantity = LongStream.iterate(startValue, value -> value != 1, sequence).count();
                    if (numbersQuantity > 500) {
                        System.out.println(startValue + " -> " + numbersQuantity);
                    }
                    return numbersQuantity;
                })
                .max();
        System.out.println("maxNumbers = " + maxNumbers);
        // Нас здесь интересует именно переменная startValue, при которой возникает последовательность максимальной длины
        // startValue = 837799 -> maxNumbers = 524

    }
}
