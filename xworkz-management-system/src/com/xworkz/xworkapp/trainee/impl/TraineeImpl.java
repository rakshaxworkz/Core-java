package com.xworkz.xworkapp.trainee.impl;

import com.xworkz.xworkapp.student.Student;
import com.xworkz.xworkapp.trainee.Trainee;

public class TraineeImpl implements Trainee {
    Student student[] = {null , null};
    int index;
    @Override
    public boolean addStudent(Student student) {
        boolean isAdded =  false;
        if(student!=null){
            if(student.getStudentName() != null){
                this.student[index++]= student;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getStudentDetails() {
        for(Student student:student) {
            System.out.println(student);
        }
    }

    @Override
    public int updateStudentAge(int newAge) {
//        if(newAge > 0){
//            this.student.setAge(newAge);
//        }
        return newAge;
    }

    @Override
    public boolean deleteStudent() {
        boolean isDeleted = false;
//        if(student!=null){
//            if(this.student.getStudentName() != null){
//                this.student = null;
//                isDeleted = true;
//            }
//        }
        return isDeleted;
    }
}
