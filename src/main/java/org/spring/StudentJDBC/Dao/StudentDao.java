package org.spring.StudentJDBC.Dao;

import org.spring.StudentJDBC.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAllStudent();
}
