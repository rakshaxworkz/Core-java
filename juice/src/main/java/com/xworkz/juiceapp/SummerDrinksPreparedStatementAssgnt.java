package com.xworkz.juiceapp;

import java.sql.*;

public class SummerDrinksPreparedStatementAssgnt {
    public static void main(String[] args) {
        try {
            Class.forName("java.sql.Driver");
            System.out.println("Loaded And Registered with Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query = "insert into summerdrinks(id,name,price) values(?,?,?)";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,8);
            preparedStatement.setString(2,"Orange juice");
            preparedStatement.setInt(3,45);
            preparedStatement.execute();

            preparedStatement.setInt(1,9);
            preparedStatement.setString(2,"Apple juice");
            preparedStatement.setInt(3,75);
            preparedStatement.execute();

            preparedStatement.setInt(1,10);
            preparedStatement.setString(2,"Grape juice");
            preparedStatement.setInt(3,38);
            preparedStatement.execute();

            preparedStatement.setInt(1,11);
            preparedStatement.setString(2,"Pomegranate juice");
            preparedStatement.setInt(3,35);
            preparedStatement.execute();

            preparedStatement.setInt(1,12);
            preparedStatement.setString(2,"GrapeFruit juice");
            preparedStatement.setInt(3,100);
            preparedStatement.execute();

            preparedStatement.setInt(1,13);
            preparedStatement.setString(2,"Pineapple juice");
            preparedStatement.setInt(3,65);
            preparedStatement.execute();

            preparedStatement.setInt(1,14);
            preparedStatement.setString(2,"Gooseberry juice");
            preparedStatement.setInt(3,135);
            preparedStatement.execute();

            preparedStatement.setInt(1,15);
            preparedStatement.setString(2,"Carrot juice");
            preparedStatement.setInt(3,125);
            preparedStatement.execute();

            preparedStatement.setInt(1,16);
            preparedStatement.setString(2,"Tomato juice");
            preparedStatement.setInt(3,15);
            preparedStatement.execute();

            preparedStatement.setInt(1,17);
            preparedStatement.setString(2,"Beet juice");
            preparedStatement.setInt(3,59);
            preparedStatement.execute();

            preparedStatement.setInt(1,18);
            preparedStatement.setString(2,"Cherry juice");
            preparedStatement.setInt(3,200);
            preparedStatement.execute();

            preparedStatement.setInt(1,19);
            preparedStatement.setString(2,"Blueberry juice");
            preparedStatement.setInt(3,249);
            preparedStatement.execute();

            preparedStatement.setInt(1,20);
            preparedStatement.setString(2,"ABC juice");
            preparedStatement.setInt(3,79);
            preparedStatement.execute();

            System.out.println("Inserted data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
