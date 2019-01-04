package me.calebbassham.euler.p5;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().answer());
    }

    public int smallestMultiple(int max) {
        int number = max;
        numLoop: while (true) {
            for (int i = 2; i <= max; i++) {
                if (number % i != 0) {
                    number++;
                    continue numLoop;
                }
            }

            return number;
        }
    }

    public int example() {
        return smallestMultiple(10);
    }

    public int answer() {
        return smallestMultiple(20);
    }

}
