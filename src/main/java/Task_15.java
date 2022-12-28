package net.projecteuler.euler.src.main.java;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
public class Task_15 {
    public static void main(String[] args) {
        // Вычисляем число 2^1000
        BigDecimal multiplyResult = new BigDecimal(2).pow(1000);
        // Переводим его в строку, разбиваем на отдельные числа
        String[] split = multiplyResult.toString().split("");
        // Вычисляем их сумму
        int sum = Arrays.stream(split)
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("sum = " + sum);
    }
}
