package com.xworkz.entertainmentapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EntertainmentUpdate {
    public static void main(String[] args) {
        //update operation
        //FQCN-package,classname
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and registered Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/entertainment";
        String userName = "root";
        String password = "8197614012";
        try {
           Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            Statement statement = connection.createStatement();
            String query = "update movie set director = 'Prashanth Neel' where name = 'KGF'";
            int result = statement.executeUpdate(query);
            System.out.println(result);
            System.out.println("Updated data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
