package com.hillel.lessons.lesson8;

import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        int m, n;
        int max=20, min=0;
        System.out.println("Треба ввести розміри для матриці M * N");
        System.out.println("Введіть число M");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                break;
            } else {
                System.out.println("М має бути числом більшим від нуля");
            }
        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            } else {
                System.out.println("N має бути числом більшим від нуля");
            }
        }
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                array1[i][j]=(int) (Math.random() * (max - min + 1) + min);
            }
        }

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                array2[j][i]=array1[i][j];
            }
        }

        System.out.println();
        System.out.println("Матриця 1:");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
        System.out.println("Матриця 2:");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

    }


}
