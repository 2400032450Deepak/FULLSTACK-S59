package com.main;

import com.dao.StudentDao;
import com.entity.Student;

public class Main {
    public static void main(String[] args) throws Exception {

        StudentDao dao = new StudentDao();

        // Insert student
        Student s = new Student(1, "Raju", 90);
        dao.insert(s);

        // Display all students
        dao.display();
    }
}
