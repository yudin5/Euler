package net.projecteuler.euler;

/**
 * Created by Tigrenok on 09.06.2017.
 */

/**
 Smallest multiple
 Problem 5
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

//Самое тупое решение, которое можно придумать. Брутал форс.

public class Task_05 {
    public static void main(String[] args) {
        boolean isSmallest = false; //отвечает за искомое число
        int i = 2520; //счетчик. Начинаем с 2520, так как по условию это число делится без остатка на все числа от 1 до 10

        while (!isSmallest) {
            for (int j = 1; j <= 20; j++) { //проверяем все множители
                if (!(i%j == 0)) { //если число не делится на какой-то множитель, то увеличиваем проверяемое число на единицу и выходим из цикла
                    i++;
                    break;
                }
                else if (j == 20) //если конец цикла достигнут, то значит число "i" делится на все числа от 1 до 20 без остатка
                    isSmallest = true;
            }
        }
        System.out.println("Минимальное число, делящееся на все числа от 1 до 20: " + i);
    }
}
