package com.xworkz.xworkapp.trainee;

import com.xworkz.xworkapp.student.Student;

public interface Trainee {
    boolean addStudent(Student student);
    void getStudentDetails();
    int updateStudentAge(int newAge);
    boolean deleteStudent();
}
