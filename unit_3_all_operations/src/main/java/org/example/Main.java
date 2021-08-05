package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter a number of the task: ");

            try {
                choice = Integer.parseInt(myObj.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 0 : {
                    System.out.println("Thank for attention. By!");
                } break;
                case 1 : {
                    new TaskOne().run();
                } break;
                case 2 : {
                    new TaskTwo().run();
                } break;
                case 3 : {
                    new TaskThree().run();
                } break;
                default : {
                    System.out.println("Please, choose the number of the task.");
                }
            }
        }
    }
}
