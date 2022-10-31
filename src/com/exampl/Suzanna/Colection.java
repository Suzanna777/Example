package com.exampl.Suzanna;


import java.util.Scanner;

public class Colection {


    /// method

   public static boolean isEvenNumber( int number){
       return number % 2 == 0;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" write any number");

        int nextNumber = sc.nextInt();
        System.out.println(" yor number is " + isEvenNumber(nextNumber));
    }


    }


