package com.xworkz.juiceapp.service;

import com.xworkz.juiceapp.dto.Juicedto;

public interface SummerDrinksService {
    void  insertJuice(Juicedto juicedto);
    void updateJuice(Juicedto juicedto);
    void deleteJuice(Juicedto juicedto);
    void readJuice(Juicedto juicedto);
    void getJuiceBetweenid(String id, String id2);
    void getNumberOfJuices(Juicedto juicedto);
    void orderByDesc(Juicedto juicedto);
    void getJuiceBetweenById(Juicedto juicedto);
}
