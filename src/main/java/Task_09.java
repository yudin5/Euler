package net.projecteuler.euler.src.main.java;

/**
 * Created by Tigrenok on 16.11.2017.
 * <p>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class Task_09 {
    public static void main(String[] args) {
        for (int i = 1000; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                for (int k = j; k > 0; k--) {
                    if ((k + j + i) == 1000 && (k * k + j * j == i * i)) {
                        System.out.println("a = " + k + " b = " + j + " c = " + i);
                        System.out.println("a*b*c = " + k * j * i);
                    }
                }
            }
        }
    }
}
