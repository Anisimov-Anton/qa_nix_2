package org.example.service;

import org.example.dao.StudentDAO;
import org.example.entity.Student;

public class StudentService {

    private StudentDAO studentDAO = new StudentDAO();

    public void create(Student student) {
        studentDAO.create(student);
    }

    public void update(Student student) {
        studentDAO.update(student);
    }

    public void delete(String id) {
        studentDAO.delete(id);
    }

    public Student getStudent(String id) {
        return studentDAO.getStudent(id);
    }

    public Student[] getStudents() {
        return studentDAO.getStudents();
    }
}
