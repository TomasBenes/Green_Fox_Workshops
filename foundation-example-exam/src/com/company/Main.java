package com.company;

import com.company.Animal_protection.Animal;
import com.company.Animal_protection.Cat;
import com.company.Animal_protection.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int matrix[][] = { { 1, 2, 3 },
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateMatrix(matrix);
        printMatrix(matrix);

    }

    public static void rotateMatrix(int matrix[][]) {
        int N = 3;
        for (int i = 0; i < N / 2; i++)
        {
            for (int j = i; j < N - i - 1; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - j][i];
                matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
                matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
                matrix[j][N - 1 - i] = temp;
            }
        }
    }

    public static void printMatrix(int matrix [][]) {
        int N = 3;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print( matrix[i][j] + " ");
            System.out.println();
        }*/

        Animal cat = new Cat(10);
        cat.name = "Whiskers";
        cat.isAdoptable(true);
        cat.toString();

        Animal dog = new Dog(10);
        dog.name = "Benny";
        dog.isAdoptable(false);
        dog.toString();
    }
}
