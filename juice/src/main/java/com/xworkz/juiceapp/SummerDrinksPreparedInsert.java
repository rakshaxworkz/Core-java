package com.xworkz.juiceapp;

import java.sql.*;

public class SummerDrinksPreparedInsert {
    public static void main(String[] args) {
        //multiple insert with single query
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) { //  classnot found exception
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012"; // SQLexception
        // ? - placeholder
        String query = "insert into summerdrinks(id,name,price) values(?,?,?)";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,6);
            preparedStatement.setString(2,"Chikku juice");
            preparedStatement.setInt(3,25);
            preparedStatement.setInt(1,7);
            preparedStatement.setString(2,"Lemon juice");
            preparedStatement.setInt(3,45);
            preparedStatement.execute();
            System.out.println("Inserted data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
