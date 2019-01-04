package me.calebbassham.euler.p7;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().answer());
    }

    public int example() {
        return nthPrime(6);
    }

    public int answer() {
        return nthPrime(10_001);
    }

    public int nthPrime(int n) {
        int candidate, count;
        for(candidate = 2, count = 0; count < n; ++candidate) {
            if (isPrime(candidate)) {
                ++count;
            }
        }
        return candidate-1;
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
