package com.xworkz.hotelroomsapp;

import com.xworkz.hotelroomsapp.hotel.Hotel;
import com.xworkz.hotelroomsapp.room.Room;

public class HotelRoomsRunner {
    public static void main(String[] args) {
        Room room = new Room();
        room.hotelName = "Panchami";
        room.hotelPrice = 2199;
        room.noOfPerson = 2;
        room.isFoodAvailable = true;

        Hotel hotel = new Hotel(room);
        hotel.bookRoom();
    }
}
