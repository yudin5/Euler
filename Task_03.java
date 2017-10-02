package net.projecteuler.euler;

/**
 * Created by Tigrenok on 09.06.2017.
 */
/** Largest prime factor
        Problem 3
 The prime factors of 13195 are 5, 7, 13 and 29.
 What is the largest prime factor of the number 600851475143 ?
*/
// Найдем все простые делители произвольного целого числа
public class Task_03 {
    public static void main(String[] args) {

        long number = 600851475143L; //проверяемое число, для которого нужно найти простые делители. Знак "L" обязателен для типа Long
        long i, j; //i - перебираемые делители числа, j - делители для делителя
        boolean isPrime = true; //служит для метки, является ли делитель числа простым

        for (i = 2; i <= number/i; i++) { //перебираем делители числа

            if ((number%i) == 0) { //если i - делитель числа number, то проверяем, простой ли он
                for (j = 2; j <= i/j; j++) //теперь перебираем делители j для числа i
                    if ((i % j) == 0) isPrime = false;
                if (isPrime) //если число i простое, то
                {
                    System.out.println("Простой делитель числа " + number + " = " + i); //выводим сообщение об очередном простом делителе
                    i++; //переходим к следующему делителю
                }
            }
        }
    }
}
