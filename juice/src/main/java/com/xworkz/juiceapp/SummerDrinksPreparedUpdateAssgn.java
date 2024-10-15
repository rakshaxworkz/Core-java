package com.xworkz.juiceapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SummerDrinksPreparedUpdateAssgn {
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
            System.out.println("Connection Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,"Watermelon milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,3);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Banana milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,4);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Oreo milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,5);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Chikku milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,6);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Lemon milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,7);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Orange milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,8);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Apple milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,9);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Grape milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,10);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Pomegranate milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,11);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"GrapeFruit milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,12);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Pineapple milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,13);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Gooseberry milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,14);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Carrot milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,15);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Tomato milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,16);
            preparedStatement.addBatch();

            preparedStatement.setString(1,"Beet milkshake");
            preparedStatement.setInt(2,249);
            preparedStatement.setInt(3,17);
            preparedStatement.addBatch();

            preparedStatement.executeBatch();

            System.out.println("Updated data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
