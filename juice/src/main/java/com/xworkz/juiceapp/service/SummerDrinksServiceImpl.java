package com.xworkz.juiceapp.service;

import com.xworkz.juiceapp.dao.SummerDrinksDao;
import com.xworkz.juiceapp.dao.SummerDrinksDaoImpl;
import com.xworkz.juiceapp.dto.Juicedto;

public class SummerDrinksServiceImpl implements SummerDrinksService {
    @Override
    public void insertJuice(Juicedto juicedto) {
        //business logic or validation logic
        if (juicedto != null && juicedto.getName() != null && !juicedto.getName().isEmpty()) {
            // dao
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.insertJuice(juicedto);

        } else {
            System.out.println("Juice name is Empty");
        }
    }

    @Override
    public void updateJuice(Juicedto juicedto) {
        if (juicedto != null && juicedto.getName() != null && !juicedto.getName().isEmpty()) {
            // dao
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.update(juicedto.getName(), juicedto.getId());

        } else {
            System.out.println("Juice name is Empty");
        }

    }

    @Override
    public void deleteJuice(Juicedto juicedto) {
        if (juicedto != null && juicedto.getName() != null && !juicedto.getName().isEmpty()) {
            // dao
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.delete(juicedto.getId());

        } else {
            System.out.println("Juice name is Empty");
        }
    }

    @Override
    public void readJuice(Juicedto juicedto) {
        if (juicedto != null && juicedto.getName() != null && !juicedto.getName().isEmpty()) {
            // dao
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.read(juicedto.getName(), juicedto.getId());
        } else {
            System.out.println("Juice name is Empty");
        }
    }

    @Override
    public void getJuiceBetweenid(String id, String id2) {
        if (id != null && !id.isEmpty() && id2 != null && !id2.isEmpty()) {
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.getJuiceBetweenid(id, id2);
            System.out.println("Getting the movie details");
        } else {
            System.out.println("Movie id is not found");
        }
    }

    @Override
    public void getNumberOfJuices(Juicedto juicedto) {
        if (juicedto != null && juicedto.getName() != null && !juicedto.getName().isEmpty()) {
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.getNumberOfJuices();
        } else {
            System.out.println("Juice name is empty");
        }
    }

    @Override
    public void orderByDesc(Juicedto juicedto) {
        if (juicedto != null && juicedto.getName() != null && !juicedto.getName().isEmpty()) {
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.orderbyAsc();
        }

    }

    @Override
    public void getJuiceBetweenById(Juicedto juicedto) {
        if (juicedto != null && juicedto.getName() != null && !juicedto.getName().isEmpty()) {
            SummerDrinksDao summerDrinksDao = new SummerDrinksDaoImpl();
            summerDrinksDao.getJuiceBetweenById(juicedto);
        }
    }
}
