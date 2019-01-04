package me.calebbassham.euler.p6;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 The sum of the squares of the first ten natural numbers is,
 12 + 22 + ... + 102 = 385

 The square of the sum of the first ten natural numbers is,
 (1 + 2 + ... + 10)2 = 552 = 3025

 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().answer());
    }

    public int differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(int highest) {
        return squareOfSum(highest) - sumOfSquares(highest);
    }

    public int sumOfSquares(int highest) {
        return range(highest).map(n -> (int) Math.pow(n, 2)).sum();
    }

    public int squareOfSum(int highest) {
        return (int) Math.pow(range(highest).sum(), 2);
    }

    private IntStream range(int min, int max, int step) {
        var array = new int[(max - min + 1) / step];

        var e = 0;
        for (int i = min; i <= max; i+=step) {
            array[e] = i;
            e++;
        }

        return Arrays.stream(array);
    }

    private IntStream range(int max) {
        return range(1, max, 1);
    }

    public int example() {
        return differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(10);
    }

    public int answer() {
        return differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(100);
    }

}
