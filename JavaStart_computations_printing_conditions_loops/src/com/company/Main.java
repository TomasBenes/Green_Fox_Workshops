package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    /*public static void main(String[] args) {
        // Modify this program to greet you instead of the World!
        System.out.println("Hello, Tomas!");
    }
    /*public static void main(String[] args) {
        // Modify this program to print Humpty Dumpty riddle correctly
        System.out.println("Humpty Dumpty sat on a wall,");
        System.out.println("Humpty Dumpty had a great fall.");
        System.out.println("All the king's horses and all the king's men");
        System.out.println("Couldn't put Humpty together again.");
    }
    public static void main(String[] args) {
        // Greet 3 of your classmates with this program, in three separate lines
        // like:
        //
        System.out.println("Hello, Mike!");
        System.out.println("Hello, Martin!");
        System.out.println("Hello, Andrea!");
    }
    public static void main(String[] args) {
        // Write a program that prints a few details to the terminal window about you
        // It should print each detail to a new line.
        //  - Your name
        //  - Your age
        //  - Your height in meters (as a decimal fraction)
        //
        //  Example output:
        //  John Doe
        //  31
        //  1.87
        System.out.println("Tomas Benes");
        System.out.println("29");
        System.out.println("1.75m");
    }
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22

        // Print the result of 13 substracted from 22

        // Print the result of 22 multiplied by 13

        // Print the result of 22 divided by 13 (as a decimal fraction)

        // Print the integer part of 22 divided by 13

        // Print the remainder of 22 divided by 13
        System.out.println(13 + 22);
        System.out.println(13 - 22);
        System.out.println(22 * 13);
        System.out.println(22. / 13.);
        System.out.println(22 / 13);
        System.out.println(22 % 13);
    }
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println(17*5*6);
        System.out.println(17*52);
        System.out.println((510. / 884.) * 100 + "%");
    }
    public static void main(String[] args) {
        int favoriteNumber = 7;
        System.out.println("My favorite number is: " + favoriteNumber);
        // Store your favorite number in a variable (as a number)
        // And print it like this: "My favorite number is: 8"
    }
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        a = 526;
        b = 123;

        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        System.out.println(massInKg/(heightInM*heightInM));
        // Print the Body mass index (BMI) based on these values
    }
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean
        String name = "Tomas";
        int age = 29;
        double height = 1.75;
        boolean married = true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(married);
    }
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a += 10;

        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b -= 7;

        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e *= 12;
        int cubicMeter = 8*8*8;

        System.out.println(e);
        System.out.println(cubicMeter);

        /*int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        boolean isBigger;
        if (f1 > f2) {
            isBigger = true;
            System.out.println(isBigger);
        } else {
            isBigger = false;
            System.out.println(isBigger);
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        g2 *= 2;
        boolean isBigger;
        if (g2 > g1) {
            isBigger = true;
            System.out.println(isBigger);
        } else {
            isBigger = false;
            System.out.println(isBigger);
        }

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int h1 = h%11;
        boolean isDivisor;
        System.out.println(h1);
        if (h1 == 0) {
            isDivisor = true;
            System.out.println(isDivisor);
        } else {
            isDivisor = false;
            System.out.println(isDivisor);
        }

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean isHigherandsmaller;
        if (i1 > i2*i2 && i1 < i2*i2*i2) {
            isHigherandsmaller = true;
            System.out.println(isHigherandsmaller);
        } else {
            isHigherandsmaller = false;
            System.out.println(isHigherandsmaller);
        }

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        j = 1521%3;
        int j1 = 1521%5;
        boolean isDividable;
        if (j == 0) {
            isDividable = true;
            System.out.println(isDividable);
        }
        if (j1 == 0){
                isDividable = true;
                System.out.println(isDividable);
        }
        else {
            isDividable = false;
            System.out.println(isDividable);
        }

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
    public static void main(String[] args) {
        double a = 10;
        double b = 10;
        double c = 10;
        double s = 2*(a*b+a*c+b*c);
        double v = a*b*c;
        System.out.println("Surface Area:" + s);
        System.out.println("Volume:" + v);
    }

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingSeconds = (24*60*60) - (14*60*60+34*60+42);
        System.out.println(remainingSeconds);
        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }


    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        String question = "what is your name?";
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("Hello, " + userInput1);
    }

    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        String question = "Please write double that is a distance in miles (I think that the sentence is written wrongly :D).";
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        int userInput2 = scanner.nextInt();
        System.out.println(userInput2 / 0.621371192237 + "km");
    }

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        int userInput2 = scanner.nextInt();
        if (userInput2 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        Scanner scanner = new Scanner(System.in);
        int userInput2 = scanner.nextInt();
        if (userInput2 <= 0) {
            System.out.println("Not enough");
        }
        if (userInput2 == 1) {
            System.out.println("One");
        }
        if (userInput2 == 2) {
            System.out.println("Two");
        }
        if (userInput2 > 2) {
            System.out.println("A lot");
        }
    }

    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        if ((userInput1 + userInput2) >= 20 && userInput1 == userInput2) {
            System.out.println("The party is excellent!");
        }
        if (((userInput1 + userInput2) >= 20) && userInput1 != userInput2) {
            System.out.println("Quite cool party!");
        }
        if ((userInput1 + userInput2) < 20) {
            System.out.println("Average party...");
        }
        if (userInput1 == 0) {
            System.out.println("Sausage party");
        }

    public static void main(String[] args) {
        // Create a program that writes this line 100 times:
        // "I won't cheat on the exam!"
        for (int i = 0; i < 100; i++) {
            System.out.println("I won't cheat on the exam!");
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500
        for (int i = 2; i < 500; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int a = 1;
        while (a < 11) {
            System.out.println(a + " * " + userInput1 + " = " + (a*userInput1)); // Prints the numbers from 0 to 9
            a += 1;
        }
    }

    public static void main(String[] args) {
        // Create a program that prints all the even numbers between 0 and 500
        for (int i = 2; i < 500; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }

    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        if (userInput1 >= userInput2) {
            System.out.println("The second number should be bigger");
        } else {
            int a = userInput1;
            while (a < userInput2) {
                System.out.println(a);
                a += 1;
            }
        }
    }

    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                    System.out.println(i);
                }
            }
        }

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        for (int i = 0; i < userInput1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        for (int i = 1; i <= userInput1; i++) {
            for (int k = i; k < userInput1; k++)
                System.out.print(" ");
            for (int j = 1; j < (i*2); j++)
                System.out.print("*");
                System.out.println();
        }
    }
     */
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        for (int i = 1; i <= userInput1; i++) {
            for (int k = i; k < userInput1; k++)
                System.out.print(" ");
            for (int j = 1; j < (i * 2); j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

