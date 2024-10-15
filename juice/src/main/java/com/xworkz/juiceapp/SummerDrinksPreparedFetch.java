package com.xworkz.juiceapp;

import java.sql.*;

public class SummerDrinksPreparedFetch {
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
        String query = "select * from summerdrinks where id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection is Established");
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 5);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt(3));
            }
            preparedStatement.setInt(1, 7);
            ResultSet resultSet1 = preparedStatement.executeQuery();
            while (resultSet1.next()) {
                System.out.println(resultSet1.getInt("id"));
                System.out.println(resultSet1.getString("name"));
                System.out.println(resultSet1.getInt(3));
            }

            System.out.println("Fetched from database");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Closing the coastly resources");
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
