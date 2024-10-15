package com.xworkz.juiceapp.dao;

import com.xworkz.juiceapp.dto.Juicedto;

import java.sql.*;

public class SummerDrinksDaoImpl implements SummerDrinksDao{



    @Override
    public void insertJuice(Juicedto juicedto) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query = "insert into summerdrinks(id,name,price) values(?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
             connection = DriverManager.getConnection(url,userName,password);
             System.out.println("Connection is Established");
             preparedStatement = connection.prepareStatement(query);
             preparedStatement.setInt(1,juicedto.getId());
             preparedStatement.setString(2,juicedto.getName());
             preparedStatement.setInt(3,juicedto.getPrice());
             preparedStatement.execute();
             System.out.println("Inserted data into database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
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

    @Override
    public void update(String name, int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query = "update summerdrinks set name = ? where id = ?";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);
            int result =  preparedStatement.executeUpdate();
            System.out.println(result);
            System.out.println("Updated data into database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query = "delete from summerdrinks where id = ?";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            boolean result = preparedStatement.execute();
            System.out.println(result);
            System.out.println("Deleted data from database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(String name, int id) {
        PreparedStatement preparedStatement=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query="select * from summerdrinks where name = ? and id = ?";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("price"));

                System.out.println(resultSet);
            }
            System.out.println("Fetched data from database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void getJuiceBetweenid(String id, String id2) {

    }

    @Override
    public void getJuiceBetweenById(Juicedto juicedto) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query = "select * from summerdrinks where id between ? and ?";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,juicedto.getStartId());
            preparedStatement.setInt(2,juicedto.getEndId());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("price"));
            }
            System.out.println("Fetched data from database using between");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getNumberOfJuices() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query = "select count(*) from summerdrinks";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            if(resultSet.next()){
                System.out.println(resultSet.getString("count(*)"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void orderbyAsc() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered with Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/juice";
        String userName = "root";
        String password = "8197614012";
        String query = "select * from summerdrinks order by id desc";
        try {
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection is Established");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("price"));
            }
            System.out.println("Fetched data from database in descending order");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
