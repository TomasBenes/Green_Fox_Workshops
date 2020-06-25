package com.company;

public class Main {

    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
        /*int n = 5;
        System.out.println(addingNumbers(n));

    }
    public static int addingNumbers(int n) {
        int start = n;
        System.out.println(n);

        if (start > 1) {
            int add = start + addingNumbers(n-1);
            return add;
        } else {
            return start;
        }*/



        /*Sum Digits
        Given a non-negative integer n, return the sum of its digits recursively (without loops).

                Hint
        Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)

        Java, C++, C#, Python
        Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).*/

        int n = 125;
        System.out.println(sumDigits(n));

    }
    public static int sumDigits (int n) {
        int lastDigit = n % 10;
        int nextNumberNeeded = n / 10;
        int middleDigit = nextNumberNeeded % 10;
        int firstDigit = middleDigit / 10;
        if (n>0 && n < 1000){
            int sum = sumDigits(firstDigit + middleDigit + lastDigit);
            return sum;
        } else {
            return n;
        }
    }
}
