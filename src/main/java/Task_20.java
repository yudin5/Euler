package net.projecteuler.euler.src.main.java;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */
public class Task_20 {

    public static void main(String[] args) {
        // Находим число 100!
        BigDecimal number = new BigDecimal(1);
        for (int i = 2; i <= 100; i++) {
            number = number.multiply(new BigDecimal(i));
        }
        System.out.println("number = " + number);

        // Переводим его в строку, разбиваем на отдельные числа
        String[] split = number.toString().split("");
        // Вычисляем их сумму
        int sum = Arrays.stream(split)
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("sum = " + sum);
    }

}
