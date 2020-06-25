package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        /*Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        try {
            int result = 10/userInput;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        }*/


        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"
        /*Path pathOfFile = Paths.get("my-file.txt");
        try {
        for (String line : Files.readAllLines(pathOfFile)) {
            System.out.println(line);
        }

        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }*/


        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        /*System.out.println(numberofLines("my-file.txt"));

    }

    public static int numberofLines (String fileName) {
        Path pathFile = Paths.get(fileName);
        int numberLines = 0;
        try {
            for (int i = 0; i < Files.readAllLines(pathFile).size(); i++) {
                numberLines += 1;
            }
        } catch (IOException e) {
            System.out.println("0");

        }
        return numberLines;*/



        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        /*something("my-file.txt");

    }

        public static void something (String path) {
        Path pathFile = Paths.get(path);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
            List<String> ahoj = new ArrayList<>();
            ahoj.add(userInput);
        try {
            Files.write(pathFile, ahoj);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        } finally {
            System.out.println("Always be executed");
        }*/




        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.





    }

}
