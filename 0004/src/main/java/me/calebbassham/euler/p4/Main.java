package me.calebbassham.euler.p4;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().threeDigits());
    }

    public int twoDigits() {
        int largest = 0;

        for (var i = 10; i <= 99; i++) {
            for (var j = 10; j <= 99; j++) {
                var product = i * j;
                if (!isPalindrome(Integer.toString(product))) continue;
                if (product > largest) largest = product;
            }
        }

        return largest;
    }

    public int threeDigits() {
        int largest = 0;

        for (var i = 100; i <= 999; i++) {
            for (var j = 100; j <= 999; j++) {
                var product = i * j;
                if (!isPalindrome(Integer.toString(product))) continue;
                if (product > largest) largest = product;
            }
        }

        return largest;
    }

    public boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public String reverse(String string) {
        var sb = new StringBuilder();

        for (var i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }

        return sb.toString();
    }

}
