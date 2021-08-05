package org.example;

import java.util.Scanner;

public class TaskOne {

    public void run() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string for summering numbers in it:");

        String newString = myObj.nextLine();
        int result = 0;

        for (int i = 0; i < newString.length(); i++) {

            if (Character.isDigit(newString.charAt(i))) {
               result += Character.digit(newString.charAt(i),10);
            }
        }

        System.out.println("Result = " + result);
    }
}
