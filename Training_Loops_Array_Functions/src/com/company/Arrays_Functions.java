package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Functions {
    public static void main(String[] args) {
        /*
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print the third element of `numbers`
        int[] numbers = {4, 5, 6, 7};
        System.out.println(numbers[2]);

        // - Create an array variable named `firstArrayOfNumbers`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `secondArrayOfNumbers`
        //   with the following content: `[4, 5]`
        // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
        //   elements than `firstArrayOfNumbers`
        int[] firstArrayOfNumbers = {1, 2, 3};
        int[] secondArrayOfNumbers = {4, 5};
        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
        System.out.println("secondArrayOfNumbers is longer");} else {
            System.out.println("firstArrayOfNumbers is longer");}


        // - Create an array variable named `numbers`
        //   with the following content: `[54, 23, 66, 12]`
        // - Print the sum of the second and the third element
        int[] numbers = {54, 23, 66, 12};
        System.out.println(numbers[1]+numbers[2]);


        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element
        int[] numbers = {1, 2, 3, 8, 5, 6};
        numbers[3] = 4;
        System.out.println(numbers[3]);


        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 4, 5]`
        // - Increment the third element
        // - Print the third element
        int[] numbers = {1, 2, 3, 4, 5};
        numbers[2] ++;
        System.out.println(numbers[2]);


        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`
        int[] numbers = {4, 5, 6, 7};
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] numbers = {4, 5, 6, 7};
        for (int number : numbers) {
            System.out.println(number);
        }


        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        int[][] twoDimensionalArray = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
        };
        for (int i=0; i<twoDimensionalArray.length; i++) {
            System.out.println();
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j]);
            }
        }


        // - Create an array variable named `numList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array
        int[] numList = {3, 4, 5, 6, 7};
        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i] * 2);
        }
        */

        /*
        // FUNCTIONS
        // - Create an integer variable named `baseNum` and assign the value `123` to it
        // - Create a function called `doubling` that doubles it's input parameter and returns with an integer
        // - Print the result of `doubling(baseNum)`
        int baseNum = 123;
        int doubleValue = doubling(baseNum);
        System.out.println(doubleValue);
    }

    public static int doubling(int baseNum) {
        return baseNum * 2;



        //  From now on, create the usual class wrapper
        //  and main method on your own.
        // - Create a string variable named `al` and assign the value `Green Fox` to it
        // - Create a function called `greet` that greets it's input parameter
        //     - Greeting is printing e.g. `Greetings dear, Green Fox`
        // - Greet `al`
        String al = "Green Fox";
        String greeting = greet(al);
        System.out.println("Greetings dear, " + greeting);
    }
        public static String greet (String al){
        return al;


        //  Create the usual class wrapper
        //  and main method on your own.
        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        // - Write a function called `appendAFunc` that gets a string as an input,
        //   appends an 'a' character to its end and returns with a string
        // - Print the result of `appendAFunc(typo)`
        String typo = "Chinchill";
        String appending = appendAFunc(typo);
        System.out.println(appendAFunc(typo));
    }
    public static String appendAFunc (String typo) {
        return typo + "a";


        //  Create the usual class wrapper
        //  and main method on your own.



        // Create the usual class wrapper and main method on your own.
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        System.out.println(sum(userInput1));
    }
    public static int sum(int userInput1) {
        int s = 0;
        for (int i = 0; i <= userInput1; i++) {
            s += i;
        }
        return s;
         */

        //  Create the usual class wrapper
        //  and main method on your own.
        // - Create a function called `factorio`
        //   that returns it's input's factorial
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        System.out.println(factorio(userInput1));
    }

    public static int factorio(int userInput1) {
        int s = 0;
        for (int i = 0; i <= userInput1; i++) {
            s += i++ * i;
        }
        return s;
    }
}
