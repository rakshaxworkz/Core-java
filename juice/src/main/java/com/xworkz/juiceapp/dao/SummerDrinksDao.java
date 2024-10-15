package com.xworkz.juiceapp.dao;

import com.xworkz.juiceapp.dto.Juicedto;

public interface SummerDrinksDao {
    public void insertJuice(Juicedto juicedto);
    public void update(String name, int id);
    public void delete(int id);
    void read(String name,int id);
    void getJuiceBetweenid(String id, String id2);
    void getJuiceBetweenById(Juicedto juicedto);
    int getNumberOfJuices();
    void orderbyAsc();
}
