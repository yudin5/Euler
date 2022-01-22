package net.projecteuler.euler.src.main.java;

/**
 * Created by Tigrenok on 04.06.2017.
 */

/**
 Multiples of 3 and 5
 Problem 1
 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Task_01 {
    public static void main(String[] args) {

        //объявляем сумму
        int sum = 0;

        //проходимся по всем целым числам от 0 до 1000. Если число делится без остатка на 3 ИЛИ 5, то прибавляем его к сумме.
        for (int i = 0; i < 1000; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) sum += i;
        }
        System.out.println(sum); //выводим сумму
    }
}
