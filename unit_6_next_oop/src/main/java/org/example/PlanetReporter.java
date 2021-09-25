package org.example;

import org.example.entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanetReporter {

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your option");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                info(position);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                info(position);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("Please type in the number if you'd like to know the acceleration gravity of the planet:");
        System.out.println("for Mercury - 1");
        System.out.println("for Venus - 2");
        System.out.println("for Earth - 3");
        System.out.println("for Mars - 4");
        System.out.println("for Jupiter - 5");
        System.out.println("for Saturn - 6");
        System.out.println("for Uranus - 7");
        System.out.println("for Neptune - 8");
        System.out.println();
        System.out.println("For exit - 0");
        System.out.println();

    }

    private void info(String position) {
        switch (position) {
            case "1":
                Mercury mercury = new Mercury();
                System.out.println("Mercury acceleration gravity is " + mercury.getAccelerationOfGravity());
                break;
            case "2":
                Venus venus = new Venus();
                System.out.println("Venus acceleration gravity is " + venus.getAccelerationOfGravity());
                break;
            case "3":
                Earth earth = new Earth();
                System.out.println("Earth acceleration gravity is " + earth.getAccelerationOfGravity());
                break;
            case "4":
                Mars mars = new Mars();
                System.out.println("Mars acceleration gravity is " + mars.getAccelerationOfGravity());
                break;
            case "5":
                Jupiter jupiter = new Jupiter();
                System.out.println("Jupiter acceleration gravity is " + jupiter.getAccelerationOfGravity());
                break;
            case "6":
                Saturn saturn = new Saturn();
                System.out.println("Saturn acceleration gravity is " + saturn.getAccelerationOfGravity());
                break;
            case "7":
                Uranus uranus = new Uranus();
                System.out.println("Uranus acceleration gravity is " + uranus.getAccelerationOfGravity());
                break;
            case "8":
                Neptune neptune = new Neptune();
                System.out.println("Neptune acceleration gravity is " + neptune.getAccelerationOfGravity());
                break;
        }
        runNavigation();
    }

}
