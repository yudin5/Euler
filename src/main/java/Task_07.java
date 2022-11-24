package net.projecteuler.euler.src.main.java;

/**
 * Created by Tigrenok on 09.06.2017.
 */
//Нужно найти 10001-е простое число
public class Task_07 {

    public static void main(String[] args) {
        int i, j, primeNumberCount = 0; //i - предполагаемое простое число, primeNumberCount - счетчик простых чисел, j - перебираемые делители
        boolean isPrime; //служит для метки, является ли число простым

        for (i = 2; primeNumberCount < 10001; i++) { //начинаем считать до 10001-го простого числа
            isPrime = true; //изначально полагаем, что i - это простое число
            for (j = 2; j <= i/j; j++) //перебираем делители j для числа i. Достаточно условия i = j*j, откуда j<=i/j
                if ((i % j) == 0) isPrime = false; //если число i делится на j, то оно не простое

            if (isPrime) //если число простое, то
            {
                primeNumberCount++; //увеличиваем счетчик простых чисел на единицу
                System.out.println("Простое число №" + primeNumberCount + " = " + i); //выводим сообщение об очередном простом числе
            }
        }
    }
}
