package com.xworkz.bankapp.bankaccount;

public class BankAccount {

    public double balance;

    public double getBalance(){
        return balance;
    }

    public void credit(double amount){
        System.out.println("Credit started");
        if(amount>0){
            balance = balance+amount;
            System.out.println("Credit successfull");
        }
        else
            System.out.println("Amount cannot be Zero");
        System.out.println("Credit Ended");
    }

    public void debit(double amount){
        System.out.println("Debit Started");
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Debit successfull");
        }
        else
            System.out.println("Insufficient funds");
        System.out.println("Debit ended");

    }
    public void transfer(BankAccount beneficiary , double amount){
        System.out.println("Tranfer started");
        if(amount>=balance){
            this.debit(amount);
            System.out.println("Amount is withdrawn from the account");
            beneficiary.credit(amount);
            System.out.println("Amount sent successfully");
        }
        else System.out.println("Insuffiecient funds");


        System.out.println("Transfer ended");

    }
}
