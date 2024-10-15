package com.xworkz.juiceapp;

import com.xworkz.juiceapp.dao.SummerDrinksDao;
import com.xworkz.juiceapp.dao.SummerDrinksDaoImpl;
import com.xworkz.juiceapp.dto.Juicedto;
import com.xworkz.juiceapp.service.SummerDrinksService;
import com.xworkz.juiceapp.service.SummerDrinksServiceImpl;

public class SummerDrinksRunner {
    public static void main(String[] args) {
        Juicedto juicedto = new Juicedto();
        //juicedto.setId(21);
     juicedto.setName("Lassi");
     juicedto.setStartId(4);
     juicedto.setEndId(7);

//       SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
//        summerDrinksDao.getJuiceBetweenById(juicedto);

        //database logic
         SummerDrinksService summerDrinksService = new SummerDrinksServiceImpl();
//        summerDrinksService.insertJuice(juicedto);

//        summerDrinksService.updateJuice(juicedto);
//        summerDrinksService.deleteJuice(juicedto);
//        summerDrinksService.getJuiceBetweenid("4","7");

//        summerDrinksService.getNumberOfJuices(juicedto);
        summerDrinksService.getJuiceBetweenById(juicedto);



    }
}
