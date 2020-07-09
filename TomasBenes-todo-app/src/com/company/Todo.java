package com.company;

public class Todo {

    public static void main(String[] args) {

        if (args.length == 0) {
            printUsageInformation();
        }

    }
    public static void printUsageInformation () {
        System.out.println("$ todo");
        System.out.println();
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println("    -l   Lists all the tasks");
        System.out.println("    -a   Adds a new task");
        System.out.println("    -r   Removes an task");
        System.out.println("    -c   Completes an task");

    }
}
