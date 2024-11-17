package net.projecteuler.euler.src.main.java;

/**
 * Created by Tigrenok on 16.11.2017.
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class Task_10 {
    public static void main(String[] args) {

        int N = 2_000_000; // Заданное число
        long summ = 0; // Сумма всех простых чисел до N

        for (int i = 2; i < N; i++) { // Проходимся по числам меньше заданного N (в нашем случае это 2 000 000)

            boolean isPrime = true; // Изначально полагаем, что число простое
            for (int j = 2; j <= i / j; j++) { // Перебираем делители для очередного числа, чтобы выяснить простое ли оно
                if ((i % j) == 0) { // Число не простое, делится нацело
                    isPrime = false;
                }
            } // Конец цикла на определение простое ли это число

            if (isPrime) { // Если число простое, то добавляем его к сумме
                summ += i;
            }
        }
        System.out.println("Сумма простых чисел до " + N + " равна: " + summ);
    }
}
