package com.xworkz.entertainmentapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EntertainmentInsert {
    public static void main(String[] args) {
        //Load and Register Driver
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Loaded and Registered Driver");

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schema_name","","");
            System.out.println("Connection to Database is Established");
            Statement statement = connection.createStatement();
            // insert a movie -- 4th step
            String query = "INSERT INTO MOVIE VALUES(1,'Kanthara','Rishab','Kannada') , (2,'KGF','Yash','Kannada') , (3,'Kalki','JuniorNTR','Telugu') , (4,'Tumbaad','Ram','Malyalam'), (5,'TheGoatLife','Rajesh','Malyalam') , (6,'Kalpana','Upendra','Kannada') , (7,'Om','Upendra','Kannada') , (8,'Ninnindale','Punith','Kannada') , (9,'Vamshi','Appu','Kannada') , (10,'Arundathi','Anushka','Kannada') , (11,'SanamTeriKasam','Siddarth','Hindi'), (12,'OmShanthiOm','Sharukhan','Hindi') , (13,'TareZameenPar','Ameerkhan','Hindi') , (14,'PK','Ameerkhan','Hindi'), (15,'KirikParty','RakshithShetty','Kannada')"  ;
                 // create , alter ,truncate , drop , rename  -- DDl
            boolean result = statement.execute(query);
             executeUpdate - insert , update , delete , DML
                     executeQuery(String) - select  , DQL
            System.out.println(result);
            System.out.println("Inserted Data into Database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{}

    }
}
