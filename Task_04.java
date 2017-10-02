package net.projecteuler.euler;

/**
 * Created by Tigrenok on 09.06.2017.
 */

/**
 Largest palindrome product
 Problem 4
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Task_04 {
    public static void main(String[] args) {
        /**Произведение двух 3-хзначных чисел - это шестизначное число вида ABCDEF.
         Чтобы оно было палиндромом, должны соблюдаться условия: A==F && B==E && C=D.
         Проверим произведения всех 3-хзначных чисел на это условие.
        */
        int i, j, number; //i,j - числа от 100 до 999, number - их произведение
        int largestPal = 0; //самый большой палиндром
        int largestI = 0, largestJ = 0; //это 2 числа, которые дают этот палиндром
        int a, b, c, d, e, f; //цифры числа "number" - произведения

        for (i = 100; i <= 999; i++) {
            for (j = 100; j <= 999; j++){
                number = i*j; //вычисляем произведение, далее вычисляем цифры этого числа
                a = number/100000;
                b = (number/10000)%10;
                c = (number/1000)%10;
                d = (number/100)%10;
                e = (number/10)%10;
                f = number%10;

                if ((a == f) && (b == e) && (c == d)) { //условие проверки - палиндром ли это?
                    if (number > largestPal) { //если это число больше предыдущего палиндрома, то присваиваем  largestPal новое значение
                        largestPal = number;
                        largestI = i;
                        largestJ = j;
                        //System.out.println(largestI + " " + largestJ);
                    }
                }
            }
        }
        System.out.println("Самый большой палиндром из произведения 2-х 3-хзначных чисел: " + largestPal);
        System.out.println("Это произведение чисел: " + largestI + " и " + largestJ);
    }
}
