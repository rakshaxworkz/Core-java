package com.xworkz.bankapp;

import com.xworkz.bankapp.savingsaccount.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {
        SavingsAccount rakshaaccount = new SavingsAccount();

        rakshaaccount.credit(10290);
        System.out.println("Closing Balance is " + rakshaaccount.getBalance());

        SavingsAccount shettysAccount = new SavingsAccount();
        rakshaaccount.transfer(shettysAccount,12000);

    }
}
