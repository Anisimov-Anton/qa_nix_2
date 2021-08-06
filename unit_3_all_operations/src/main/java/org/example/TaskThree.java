package org.example;

import java.util.Scanner;

public class TaskThree {

    public void run() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number of a lesson: ");

        try {
            int x = Integer.parseInt(myObj.nextLine());
            if (0 < x && x < 11) {
                int resultSecondsTotal = x * 45 + (x / 2) * 5 + ((x + 1) / 2 - 1) * 15;
                System.out.println(resultSecondsTotal / 60 + 9 + " " + resultSecondsTotal % 60);
            } else {
                System.out.println("Please enter a number from 1 to 10: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
