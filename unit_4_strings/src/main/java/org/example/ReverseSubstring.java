package org.example;

import java.util.Scanner;

public class ReverseSubstring {

    public void run() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string for reverse according substring:");
        String newString = myObj.nextLine();

        System.out.println("Enter substring:");
        String substring = myObj.nextLine();

        String[] words = newString.split(substring, 2);
        String reverseSubstring = "";

        for (int i = substring.length() - 1; i > -1; i--) {

            reverseSubstring += substring.charAt(i);

        }

        String result = words[0] + reverseSubstring + words[1];
        System.out.println("Result = " + result);
    }
}
