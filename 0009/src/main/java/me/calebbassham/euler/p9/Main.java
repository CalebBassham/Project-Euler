package me.calebbassham.euler.p9;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().answer());
    }

    public double example() {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                var aSqr = Math.pow(a, 2);
                var bSqr = Math.pow(b, 2);
                var cSqr = aSqr + bSqr;

                var c = Math.sqrt(cSqr);

                if (a + b + c == 12) {
                    return a * b * c;
                }
            }
        }

        return -1;
    }

    public double answer() {
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                var aSqr = Math.pow(a, 2);
                var bSqr = Math.pow(b, 2);
                var cSqr = aSqr + bSqr;

                var c = Math.sqrt(cSqr);

                if (a + b + c == 1000) {
                    return a * b * c;
                }
            }
        }

        return -1;
    }

}
