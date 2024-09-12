package com.xworkz.bookapp.chart;

import com.xworkz.bookapp.stationary.Stationary;

public interface Charts {
    boolean chartAdded(Stationary stationary);
    void getChartDetails();
    boolean updateChartPriceById(int existingId , double newPrice);
}
