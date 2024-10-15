package com.xworkz.juiceapp.dto;

import lombok.Data;

@Data
public class Juicedto {
    private int id;
    private String name;
    private int price;
    private int startId;
    private int endId;

    public  Juicedto(){

    }
    public  Juicedto(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;

    }
}
