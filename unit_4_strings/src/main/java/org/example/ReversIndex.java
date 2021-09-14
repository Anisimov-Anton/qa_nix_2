package org.example;

import java.util.Scanner;

public class ReversIndex {

    public void run() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string for reverse according indexes:");
        String newString = myObj.nextLine();

        System.out.println("Enter start index:");
        int firstIndex = Integer.parseInt(myObj.nextLine());

        System.out.println("Enter last index:");
        int lastIndex = Integer.parseInt(myObj.nextLine());

        try {
            String substring = newString.substring(firstIndex, lastIndex + 1);
            String[] words = newString.split(substring, 2);
            String reverseSubstring = "";

            for (int i = substring.length() - 1; i > -1; i--) {
                reverseSubstring += substring.charAt(i);
            }

            String result = words[0] + reverseSubstring + words[1];
            System.out.println("Result = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
