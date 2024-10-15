package com.xworkz.entertainmentapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EntertainmentDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered Driver");
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
            // createStatement- nonstaticmethod , execute,executeUpdate
            //class- Class, DriverMAnager
            // interface- statement , connection , preparedstatement
            //static method -forNAme , getconnection
            String query = "delete from movie where id = 3";
            boolean result = statement.execute(query);
            System.out.println(result);
            System.out.println("Deleted data from database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
