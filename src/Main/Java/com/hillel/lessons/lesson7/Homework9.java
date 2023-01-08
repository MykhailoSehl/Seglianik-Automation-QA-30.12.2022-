package com.hillel.lessons.lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int minAge = 18, maxAge = 40;


        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
            //System.out.println("Записали число " + team1[i]);
        }
        System.out.println();
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) Math.round((Math.random() * (maxAge - minAge)) + minAge);
            //System.out.println("Записали число " + team2[i]);
        }


        System.out.println("Вік гравців першої команди: " + Arrays.toString(team1));
        System.out.println("Вік гравців другої команди: " + Arrays.toString(team2));
        System.out.println();
        System.out.println("Середній вік гравців першої команди: " + Arrays.stream(team1).average().orElse(Double.NaN));
        System.out.println("Середній вік гравців другої команди: " + Arrays.stream(team2).average().orElse(Double.NaN));

    }
}
