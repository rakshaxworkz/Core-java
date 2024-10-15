package com.xworkz.juiceapp;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SummerDrinksPreparedDelete {
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
        String query = "delete from summerdrinks where id = ?";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,1);
            preparedStatement.execute();
            System.out.println("Deleted from database");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
