package org.example.db;

import org.example.entity.Student;

import java.util.Arrays;
import java.util.UUID;

public class StudentDB {

    private Student[] students = new Student[10];
    int size = 0;

    public void create(Student student) {
        student.setId(generateId());
        if (size == students.length) {
            students = Arrays.copyOf(students, students.length + 10);
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                size++;
                break;
            }
        }
    }

    public void update(Student student) {
        for (int i = 0; i < size; i++) {
            if ((students[i].getId() != null) && (students[i].getId().equals(student.getId()))) {
                students[i].setName(student.getName());
                students[i].setAge(student.getAge());
                break;
            }
        }
    }

    public void delete(String id) {
        for (int i = 0; i < size; i++) {
            if (((students[i].getId() != null)) && (students[i].getId().equals(id))) {
                students[i] = null;
                for (int j = i + 1; j < students.length; j++) {
                    students[j - 1] = students[j];
                    students[j] = null;
                }
                break;
            }
        }
    }

    public Student getStudent(String id) {
        int i;
        for (i = 0; i < students.length; i++) {
            if ((students[i].getId() != null) && (students[i].getId().equals(id))) {
                return students[i];
            }
        }
        return students[i];
    }

    public Student[] getStudents() {
        return students;
    }

    public String generateId() {
        String id = UUID.randomUUID().toString();
        for (Student student : students) {
            if (student!=null && student.getId().equals(id)){
                return generateId();
            }
        }
        return id;
    }
}
