package com.xworkz.hotelroomsapp.hotel;

import com.xworkz.hotelroomsapp.room.Room;

public class Hotel {
    Room room;
    public Hotel(Room room){
        this.room = room;
    }
    public void bookRoom(){
        if(room!=null)
            this.room.displayInfo();
        else
            System.out.println("Rooms not found");
    }
}
