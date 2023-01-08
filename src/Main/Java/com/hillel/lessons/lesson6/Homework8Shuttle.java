package com.hillel.lessons.lesson6;

public class Homework8Shuttle {
    public static void main(String[] args) {
        int unluckyNumber1=4, unluckyNumber2=9;
        int shuttleNumber=1;
        for (int i = 1; shuttleNumber<=100; i++){
            if (i > 0 && i < 10){
                if (i == unluckyNumber1 || i == unluckyNumber2){
                    continue;
                } else {
                    System.out.println(shuttleNumber + " Шатл має номер " + i);
                    shuttleNumber++;
                }
            } else if (i >= 10 && i < 100){
                if (i / 10 == unluckyNumber1 || i % 10 == unluckyNumber1 || i / 10 == unluckyNumber2 || i % 10 == unluckyNumber2){
                    continue;
                } else {
                    System.out.println(shuttleNumber + " Шатл має номер " + i);
                    shuttleNumber++;
                }
            } else if (i >= 100 && i < 1000){
                if (i / 100 == unluckyNumber1 || i % 10 % 10 == unluckyNumber1 || i / 100 == unluckyNumber2 || i % 10 % 10 == unluckyNumber2 || i / 10 % 10 == unluckyNumber1 || i / 10 % 10 == unluckyNumber2){
                    continue;
                } else {
                    System.out.println(shuttleNumber + " Шатл має номер " + i);
                    shuttleNumber++;
                }
            }
        }
    }
}
