package com.hillel.lessons.lesson5;

import java.util.Scanner;

public class Homework6CounterStrike {
    public static void main(String[] args) {

        int[] fragsTeam1 = new int[5];
        int[] fragsTeam2 = new int[5];
        double avgFragTeam1=0, avgFragTeam2=0;

        System.out.println("Введіть ім'я першої команди");
        Scanner scanner = new Scanner(System.in);
        String firstTeamName = scanner.nextLine();

        for(int i=0; i<fragsTeam1.length; i++ ){

            System.out.println("Введіть цілочисельне значення фрагів для гравця " + (i+1) + " першої команди");
            while (true) {
                Scanner frag = new Scanner(System.in);
                if(frag.hasNextInt()) {
                    fragsTeam1[i] = frag.nextInt();
                    frag.nextLine();
                    avgFragTeam1+=fragsTeam1[i];
                    break;
                }else{
                System.out.println("Будь ласка, введіть цілочисельне значення");
                }
            }
        }

        System.out.println("\n\nВведіть ім'я другої команди");
        String secondTeamName = scanner.nextLine();

        for( int i=0; i<fragsTeam2.length; i++){
            System.out.println("Введіть цілочисельне значення фрагів для гравця " + (i+1) + " другої команди");
            while (true) {
                Scanner frag = new Scanner(System.in);
                if(frag.hasNextInt()) {
                    fragsTeam2[i] = frag.nextInt();
                    frag.nextLine();
                    avgFragTeam2+=fragsTeam2[i];
                    break;
                }else{
                    System.out.println("Будь ласка, введіть цілочисельне значення");
                }
            }
        }

        avgFragTeam1=avgFragTeam1/fragsTeam1.length;
        avgFragTeam2=avgFragTeam2/fragsTeam2.length;

        if(avgFragTeam1>avgFragTeam2){
            System.out.println("\n\nПеремогла команда " + firstTeamName + " \nСередня кількість очків на гравця " +
                    avgFragTeam1);
        } else if(avgFragTeam1<avgFragTeam2){
            System.out.println("Перемогла команда " + secondTeamName + " \nСередня кількість очків на гравця " +
                    avgFragTeam2);
        } else System.out.println("\n\nНічия між командами " + firstTeamName + " та " + secondTeamName +
                "\nОбидві набрали по " + avgFragTeam1 + " очок на гравця в середньому");

    }
}
