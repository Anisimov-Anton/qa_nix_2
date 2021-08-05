package org.example;

import java.util.Scanner;

public class TaskThree {

    public void run() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number of a lesson: ");

        try {
            int x = Integer.parseInt(myObj.nextLine());
            int resultSecondsTotal = x * 45 + (x / 2) * 5 + ((x + 1) / 2 - 1) * 15;
            System.out.println(resultSecondsTotal / 60 + 9 + " " + resultSecondsTotal % 60);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
