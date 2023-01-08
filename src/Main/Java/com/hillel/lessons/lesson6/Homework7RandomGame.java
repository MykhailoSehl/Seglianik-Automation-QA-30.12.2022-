package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class Homework7RandomGame {
    public static void main(String[] args) {
        int randomInt;
        int usersNumber;
        int min=0, max=10;
        int attempts = 5;
        boolean hintsFlag;
        int intForScanner;

        randomInt = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(randomInt);      //    -- Спойлер числа, яке загадав комп'ютер --
        System.out.println("\nЧи потрібні Вам підказки? \nЯкщо ТАК, то введіть 1, якщо НІ, то введіть 0");
        while (true) {
            Scanner flagScanner = new Scanner(System.in);
            if (flagScanner.hasNextInt()) {
               intForScanner=flagScanner.nextInt();
                if (intForScanner == 1) {
                    hintsFlag = true;
                    break;
                } else if (intForScanner == 0) {
                    hintsFlag = false;
                    break;
                } else System.out.println("Число " + intForScanner + " недопустиме. Введіть 1 або 0, де 1 - ТАК, а 0 - НІ");
            } else System.out.println("Введіть цілочисельне число 1 або 0, де 1 - ТАК, а 0 - НІ");
        }

            for (int i=0; i<attempts; i++){
                System.out.println("\nВведіть число від " + min + " до " + max +", щоб вгадати, яке число загадав комп'ютер:");
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    if (scanner.hasNextInt()) {
                        usersNumber = scanner.nextInt();
                        if (usersNumber >= 0 && usersNumber <= 10) {
                            if (usersNumber==randomInt){
                                System.out.println("Ви виграли! \nКомп'ютер дійсно загадав число " + randomInt);
                                i=attempts;
                                break;
                            } else if (i==attempts-1) {
                                if(hintsFlag) {
                                    System.out.println("Ми б дали Вам ще одну підказку, але, на жаль, це була " +
                                            "остання спроба.\nВи програли.");
                                    break;
                                } else {
                                    System.out.println("На жаль, усі спроби вичерпано.\nВи програли");
                                    break;
                                }
                            } else if (!hintsFlag) {
                                System.out.println("Комп'ютер загадав інше число");
                                break;
                            } else if (usersNumber > randomInt) {
                                System.out.println("Число, яке загадав комп'ютер МЕНШЕ, ніж " + usersNumber);
                                break;
                            } else {
                                System.out.println("Число, яке загадав комп'ютер БІЛЬШЕ, ніж " + usersNumber);
                                break;
                            }
                        } else System.out.println("Число має бути в діапазоні " + min + "-" + max);
                    } else System.out.println("Число має бути цілочисельним");
                }
            }
    }
}
