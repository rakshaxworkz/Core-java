package com.xworkz.bookapp.chart.impl;

import com.xworkz.bookapp.chart.Charts;
import com.xworkz.bookapp.stationary.Stationary;

public class ChartsImpl implements Charts {
    Stationary stationary[] = new Stationary[5];
    int index;
    @Override
    public boolean chartAdded(Stationary stationary) {
        boolean isAdded = false;
        if(stationary!=null){
            if(stationary.getChartName() != null){
                this.stationary[index++] = stationary;
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getChartDetails() {
        for(Stationary stationary : stationary) {
            System.out.println(stationary);
        }
    }

    @Override
    public boolean updateChartPriceById(int existingId, double newPrice) {
        boolean isUpdated = false;
        for (int start = 0; start < this.stationary.length ; start++) {
            if(this.stationary[start].getChartId() == existingId){
                this.stationary[start].setPrice(newPrice);
                isUpdated = true;
            }
        }
        return isUpdated;
    }
}
