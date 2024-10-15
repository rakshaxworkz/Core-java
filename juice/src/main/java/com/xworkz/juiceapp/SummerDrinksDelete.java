package com.xworkz.juiceapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SummerDrinksDelete {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection Established");
            Statement statement = connection.createStatement();
            String query = "delete from summerdrinks where id = 2";
            boolean result = statement.execute(query);
            System.out.println(result);
            System.out.println("Deleted from database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
