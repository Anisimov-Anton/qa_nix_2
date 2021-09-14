package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentController {

    private StudentService studentService = new StudentService();

    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select your option");
        String position;
        try {
            runNavigation();
            while ((position = reader.readLine()) != null) {
                crud(position, reader);
                position = reader.readLine();
                if (position.equals("0")) {
                    System.exit(0);
                }
                crud(position, reader);
            }
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void runNavigation() {
        System.out.println();
        System.out.println("If you want create student, please enter 1");
        System.out.println("If you want update student, please enter 2");
        System.out.println("If you want delete student, please enter 3");
        System.out.println("If you want find student, please enter 4");
        System.out.println("If you want get all students, please enter 5");
        System.out.println("If you want exit, please enter 0");
        System.out.println();
    }

    private void crud(String position, BufferedReader reader) {
        switch (position) {
            case "1":
                create(reader);
                break;
            case "2":
                update(reader);
                break;
            case "3":
                delete(reader);
                break;
            case "4":
                findById(reader);
                break;
            case "5":
                findAll(reader);
                break;
        }
        runNavigation();
    }

    private void create(BufferedReader reader) {
        System.out.println("StudentController.create");
        try {
            System.out.println("Please, enter student's name");
            String name = reader.readLine();
            System.out.println("Please, enter student's age");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            Student student = new Student();
            student.setName(name);
            student.setAge(age);
            studentService.create(student);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void update(BufferedReader reader) {
        System.out.println("UserController.update");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            System.out.println("Please, enter student's name");
            String name = reader.readLine();
            System.out.println("Please, enter student's age");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            Student student = new Student();
            student.setId(id);
            student.setName(name);
            student.setAge(age);
            studentService.update(student);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void delete(BufferedReader reader) {
        System.out.println("StudentController.delete");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            studentService.delete(id);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findById(BufferedReader reader) {
        System.out.println("StudentController.findStudent");
        try {
            System.out.println("Please, enter id");
            String id = reader.readLine();
            Student student = studentService.getStudent(id);
            System.out.println("student = " + student);
        } catch (IOException e) {
            System.out.println("problem: = " + e.getMessage());
        }
    }

    private void findAll(BufferedReader reader) {
        System.out.println("StudentController.findStudents");
        Student[] students = studentService.getStudents();
        for (Student student : students) {
            System.out.println("student = " + student);
        }
    }
}
