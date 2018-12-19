package me.calebbassham.euler.p3;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().problem());
    }

    private int largestPrimeFactor(long num) {
        return primeFactors(num)
                .max()
                .getAsInt();
    }

    private IntStream primeFactors(long num) {
        var list = new ArrayList<Integer>();
        var factor = 2;

        while (num > 1) {
            if (num % factor == 0) {
                list.add(factor);
                num /= factor;
            } else {
                factor++;
            }
        }

        return list.stream().mapToInt(Integer::intValue);
    }

    public int example() {
        return largestPrimeFactor(13195);
    }

    public int problem() {
        return largestPrimeFactor(600851475143L);
    }

}
