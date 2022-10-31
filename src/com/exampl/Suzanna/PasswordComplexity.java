package com.exampl.Suzanna;

import java.util.Scanner;

public class PasswordComplexity {

    /// method
    public static boolean isPasswordCoplex(String password){

        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a password: ");

        String userInput = sc.nextLine();
        System.out.println("is the passwor is complex? " + isPasswordCoplex(userInput));
    }
}
