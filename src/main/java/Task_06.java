package net.projecteuler.euler.src.main.java;

/**
 * Created by Tigrenok on 09.06.2017.
 */

/**
 Sum square difference
 Problem 6
 The sum of the squares of the first ten natural numbers is,
 12 + 22 + ... + 102 = 385
 The square of the sum of the first ten natural numbers is,
 (1 + 2 + ... + 10)2 = 552 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
// Сумма всех чисел от 1 до N = N*(N+1)/2
// Сумма квадратов чисел от 1 до N = N*(N+1)*(2*N+1)/6
public class Task_06 {
    public static void main(String[] args) {
        int n = 100; //число N
        int sumOfSq = n*(n+1)*(2*n+1)/6; // Сумма квадратов
        int sqOfSum = (n*(n+1)/2)*(n*(n+1)/2); // Квадрат суммы
        int dif = sqOfSum - sumOfSq; // Искомая разность
        System.out.println("Разность между квадратом суммы и суммой квадратов всех чисел от 1 до " + n + " равна " + dif);
    }
}
