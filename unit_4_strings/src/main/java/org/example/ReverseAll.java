package org.example;

import java.util.Scanner;

public class ReverseAll {

    public void run() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string for reverse:");

        String newString = myObj.nextLine();
        String result = "";

        for (int i = newString.length() - 1; i > -1; i--) {

            result += newString.charAt(i);

        }

        System.out.println("Result = " + result);
    }
}
