package com.xworkz.supermarketapp.workers;

public class Workers {
    public String name;
    public long phoneNumber;
    public int age;
    public int salary;

    public void displayInfo(){
        System.out.println("The name is " + this.name);
        System.out.println("The Phone Number is " + this.phoneNumber);
        System.out.println("The Age of a person is " + this.age);
        System.out.println("The salary of a person " + this.salary);
    }
}
