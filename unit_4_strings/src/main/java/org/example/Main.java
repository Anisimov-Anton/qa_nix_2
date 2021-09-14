package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a number of the task: \n 1 - Reverse all string\n 2 - Reverse according substring\n 3 - Reverse depend on indexes\n 0 - Exit");

            try {
                choice = Integer.parseInt(myObj.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 0: {
                    System.out.println("Thank for attention. By!");
                }
                break;
                case 1: {
                    new ReverseAll().run();
                }
                break;
                case 2: {
                    new ReverseSubstring().run();
                }
                break;
                case 3: {
                    new ReversIndex().run();
                }
                break;
                default: {
                    System.out.println("Please, choose the number of the task.");
                }
            }
        }
    }
}
