package com.xworkz.mobileapp;

import com.xworkz.mobileapp.contacts.Contacts;
import com.xworkz.mobileapp.mobile.Mobile;

public class MobileRunner {

    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.contactName = "Raksha";
        contacts.phoneNumber = 5678754444L;

        Mobile mobile = new Mobile(contacts);
        mobile.openContacts();
    }
}
