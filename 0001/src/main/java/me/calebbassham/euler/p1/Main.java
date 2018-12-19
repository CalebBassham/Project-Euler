package me.calebbassham.euler.p1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * PROBLEM 1
 *
 * Example: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().problem());
    }

    private int sumMultiplesOfThreeAndFive(int ceil) {
        return range(0, ceil, 1)
                .filter((i) -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }

    public int example() {
        return sumMultiplesOfThreeAndFive(10);
    }

    public int problem() {
        return sumMultiplesOfThreeAndFive(1000);
    }

    private IntStream range(int min, int max, int step) {
        var array = new int[(max - min) / step];

        var e = 0;
        for (int i = min; i < max; i+=step) {
            array[e] = i;
            e++;
        }

        return Arrays.stream(array);
    }

}
