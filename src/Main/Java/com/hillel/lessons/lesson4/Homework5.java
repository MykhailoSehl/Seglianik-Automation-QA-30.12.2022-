package com.hillel.lessons.lesson4;

public class Homework5 {
    public static void main(String[] args) {

        int liWarrior=13, liArcher=24, liRider=46, minWarrior=9, minArcher=35, minRider=12;
        int liWarriorQuantityOfEveryType=860;
        double minWarriorQuantityOfEveryType = liWarriorQuantityOfEveryType*1.5;
        double liOverallAttack, minOverallAttack;


        liOverallAttack=(liWarrior+liArcher+liRider)*liWarriorQuantityOfEveryType;
        minOverallAttack=(minWarrior+minArcher+minRider)*minWarriorQuantityOfEveryType;


        System.out.println("Li army overall attack = " + liOverallAttack);
        System.out.println("Min army overall attack = " + minOverallAttack);

    }
}
