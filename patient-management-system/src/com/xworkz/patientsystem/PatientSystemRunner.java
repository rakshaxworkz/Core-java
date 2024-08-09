package com.xworkz.patientsystem;

import com.xworkz.patientsystem.area.Area;
import com.xworkz.patientsystem.city.City;
import com.xworkz.patientsystem.country.Country;
import com.xworkz.patientsystem.state.State;
import com.xworkz.patientsystem.street.Street;

public class PatientSystemRunner {
    public static void main(String[] args) {

        Street street = new Street();
        street.streetName="3rd main";
        street.streetNumber = 345;

        Area area = new Area(street);
        area.areaName = "Rajajinagar";

        City city = new City(area);
        city.cityName = "Bangalore";

        State state = new State(city);
        state.stateName = "Karnataka";

        Country country = new Country(state);
        country.countryName = "India";
        country.printState();

    }
}
