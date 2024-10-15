package com.xworkz.juiceapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SummerDrinksPreparedUpdate {
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
        String query = "update summerdrinks set name = ? , price = ? where id = ?";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"RedMango juice");
            preparedStatement.setInt(2,149);
            preparedStatement.setInt(3,1);
            preparedStatement.execute();
            System.out.println("Updated data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
