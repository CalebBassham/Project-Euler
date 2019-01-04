package me.calebbassham.euler.p10;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().answer());
    }

    public long answer() {
        long sum = -1;
        for (int i = 1; i < 2E6; i++) {
            if (!isPrime(i)) continue;
            sum += i;
        }
        return sum;
    }

    public long example() {
        long sum = -1;
        for (int i = 0; i < 10; i++) {
            if (!isPrime(i)) continue;
            sum += i;
        }
        return sum;
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i < n; ++i) {
            if (n % i == 0) {
                // We are naive, but not stupid, if
                // the number has a divisor other
                // than 1 or itself, we return immediately.
                return false;
            }
        }
        return true;
    }

}
