package com.xworkz.bookapp;

import com.xworkz.bookapp.chart.Charts;
import com.xworkz.bookapp.chart.impl.ChartsImpl;
import com.xworkz.bookapp.stationary.Stationary;

import java.util.Scanner;

public class BookStoreRunner {
    public static void main(String[] args) {
        Charts charts = new ChartsImpl();

        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 5 ; index++) {
            Stationary stationary = new Stationary();
            System.out.println("Enter the Chart Id");
            int id = scanner.nextInt();
            stationary.setChartId(id);
            System.out.println("Enter the Chart type");
            String type = scanner.next();
            stationary.setChartType(type);
            System.out.println("Enter the Chart Name");
            String name = scanner.next();
            stationary.setChartName(name);
            System.out.println("Enter the Chart color");
            String color = scanner.next();
            stationary.setChartColor(color);
            System.out.println("Enter the Chart Price");
            Double price = scanner.nextDouble();
            stationary.setPrice(price);

            boolean added = charts.chartAdded(stationary);
            System.out.println(" is added" + added);

        }
        charts.getChartDetails();
        charts.updateChartPriceById(2,100);
        charts.getChartDetails();

    }
}


