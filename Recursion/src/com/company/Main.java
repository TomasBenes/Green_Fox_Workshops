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

        /*int n = 126;
        System.out.println(sumDigits(n));

    }
    public static int sumDigits (int n) {
        int lastDigit = n % 10;
        int nextNumberNeeded = n / 10;
        *//*int middleDigit = nextNumberNeeded % 10;
        int firstDigit = middleDigit / 10;*//*
        if (n==0){
            return 0;
        } else {

           return lastDigit + sumDigits(nextNumberNeeded);
        }*/



        /*POWER
        Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).*/

        /*int base = 3;
        int n = 3;
        System.out.println(poweringOfNumbers(base, n));

    }
    public static int poweringOfNumbers (int base, int n) {
        if (n != 0){
            return (base * poweringOfNumbers(base, n - 1));
        } else {
            return 1;
    }*/



        /*Bunnies
        We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).*/

        /*int bunnies = 5;
        System.out.println(numberOfEars(bunnies));

    }
    public static int numberOfEars (int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + numberOfEars(bunnies - 1);
        }*/




        /*Bunnies again
        We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).*/

        /*int bunnies = 6;
        System.out.println(numberOfEars(bunnies));

    }
    public static int numberOfEars (int bunnies) {
        if (bunnies == 0) {
            return 0;
        } if (bunnies % 2 == 0) {
            return 3 + numberOfEars(bunnies - 1);
        } else {
            return 2 + numberOfEars(bunnies - 1);
        }*/


        /*Strings
        Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.*/
        /*string.charat(0)*/
        /*String base = "xerxes x xerxes";
        char from = 'x';
        char to = 'y';
        System.out.println(changeOfCharsNew(base, from, to));
    }

    public static String changeOfCharsNew (String base, char from, char to) {
        if (base.length() < 1) {
            return base;
        } else {
            char first = from == base.charAt(0) ? to : base.charAt(0);
            return first + changeOfCharsNew(base.substring(1), from, to);
        }*/



       /* Strings again
        Given a string, compute recursively a new string where all the 'x' chars have been removed.*/

        /*String base = "xerxes";
        System.out.println(removingChar(base));
    }
    public static String removingChar (String base) {
        if (base.length() < 1) {
            return base;
        } else {
            base = removingChar(base.replaceAll("x", ""));
            return base;
        }
    }  JAK TAM PRIDAT to rekurzivni pocitani?*/




        /*Fibonacci
        The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.*/

        /*System.out.println("The 7th fibonacci number is: " + fibonacci(7));
        System.out.println("The 12th fibonacci number is: " + fibonacci(12));
        System.out.println("The 40th fibonacci number is: " + fibonacci(40));
    }
        public static int fibonacci(int n)  {
            if (n < 2) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }*/


    }
}
