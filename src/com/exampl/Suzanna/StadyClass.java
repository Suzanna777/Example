package com.exampl.Suzanna;

import java.util.Scanner;

public class StadyClass {
    public static void main(String[] args) {
        System.out.println("pick a number between 1 and 10");
        Scanner sc = new Scanner(System.in);

        int inputtedNum = sc.nextInt();

        if(inputtedNum < 5){
            System.out.println("enjoy the good luck a friend brings you");
        }
        else {
            System.out.println("your shoe selection will make you very happy today");
        }
    }
}
