package com.xworkz.mobileapp.mobile;

import com.xworkz.mobileapp.contacts.Contacts;

public class Mobile {
    Contacts contacts;

    public Mobile(Contacts contacts){
        System.out.println("Mobile Number is invoked");
        System.out.println("No of Parameters : 1");
        System.out.println("type of Parameter : Contacts type");
        this.contacts = contacts;
    }

    public void openContacts(){
        System.out.println("Opening Contacts");
        if(contacts!=null)
            this.contacts.contactDetails();
        else
            System.out.println("No Contacts found");
        System.out.println("End of OpenContacts");
    }
}
