package com.xworkz.xworkapp;

import com.xworkz.xworkapp.student.Student;
import com.xworkz.xworkapp.trainee.Trainee;
import com.xworkz.xworkapp.trainee.impl.TraineeImpl;

import java.util.Scanner;

public class XworkzRunner {
    public static void main(String[] args) {
        Trainee trainee = new TraineeImpl();

        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 2; index++) {
            Student student = new Student();
            System.out.println("Enter the Student ID");
            int id = scanner.nextInt();
            student.setStudentId(id);
            System.out.println("Enter the student Name");
            String name = scanner.next();
            student.setStudentName(name);
            System.out.println("Enter the Student age");
            int age = scanner.nextInt();
            student.setAge(age);
            System.out.println("Enter the Student PhoneNumber ");
            long phoneNumber = scanner.nextLong();
            student.setPhoneNumber(8197614012L);

            boolean addStudent = trainee.addStudent(student);
            System.out.println("Student added successfully " + addStudent);

        }
        trainee.getStudentDetails();



//        Student student1 = new Student();
//        student1.setStudentId(2);
//        student1.setStudentName("Sinchana Shetty");
//        student1.setAge(22);
//        student1.setPhoneNumber(9837288188L);

//        trainee.addStudent(student);
//        trainee.addStudent(student1);
//        trainee.getStudentDetails();





//        trainee.updateStudentAge(30);
//        trainee.deleteStudent();
//        trainee.getStudentDetails();
    }
}
