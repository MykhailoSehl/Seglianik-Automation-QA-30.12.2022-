package com.hillel.lessons.lesson1;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[11];
        for (int i=0; i<10; i++){
            System.out.println(i+1 + " note");
            arr[i]=1;
            System.out.println(i + " " + arr[i]);
        }
    }
}
