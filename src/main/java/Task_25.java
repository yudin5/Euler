package net.projecteuler.euler.src.main.java;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * The 12th term, F12, is the first term to contain three digits.
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
public class Task_25 {

    public static void main(String[] args) {

        // Брут-форс. Я уже примерно представлял с какого числа надо искать, это можно оценить (см. ниже в методе коммент)
        int i = 4780;
        boolean found;
        do {
            i++;
            found = checkNumber(i);
        } while (!found);
        System.out.println("i = " + i);
    }

    // Генерим последовательность Фибоначчи до указанного числа и проверяем не стало ли в очередном числе 1000 цифр
    public static boolean checkNumber(int i) {
        Optional<BigInteger[]> first = Stream.iterate(new BigInteger[]{BigInteger.ONE, BigInteger.ONE},
                        p -> new BigInteger[]{p[1], p[0].add(p[1])})
                .limit(i) // можно просто перебором найти это число, пока не станет выполняться условие
                .filter(number -> number[0].toString().length() >= 1000)
                .findFirst();
        return first.isPresent();
    }

}
