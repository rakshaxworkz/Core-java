package com.xworkz.juiceapp;

import java.sql.*;

public class SummerDrinksFetch {
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
            System.out.println("Connection to Database is established");
            Statement statement = connection.createStatement();
            String query = "select * from summerdrinks";
            ResultSet result = statement.executeQuery(query);
            System.out.println(result);

            while (result.next()) {

                System.out.println("Summer drinks details");
                String name = result.getString("name");
                System.out.println(name);
                int id = result.getInt("id");
                System.out.println(id);
                int price = result.getInt("price");
                System.out.println(price);
                // or System.out.println(result.getInt("id"));
            }
            System.out.println("Fetching data from database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
