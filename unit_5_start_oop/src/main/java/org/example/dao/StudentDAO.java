package org.example.dao;

import org.example.db.StudentDB;
import org.example.entity.Student;

public class StudentDAO {

    private StudentDB studentDB = new StudentDB();

    public void create(Student student) {
        studentDB.create(student);
    }

    public void update(Student student) {
        studentDB.update(student);
    }

    public void delete(String id) {
        studentDB.delete(id);
    }

    public Student getStudent(String id) {
        return studentDB.getStudent(id);
    }

    public Student[] getStudents() {
        return studentDB.getStudents();
    }

}
