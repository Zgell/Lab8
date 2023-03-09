package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    private CustomList mockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = mockCityList();
        int listsize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listsize+1);
    }

    @Test
    public void hasCityTest() {
        list = mockCityList();
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);
        assertTrue(list.hasCity(vancouver));
    }

    @Test
    public void deleteCityTest() {
        list = mockCityList();
        City saskatoon = new City("Saskatoon", "SK");
        City regina = new City("Regina", "SK");
        list.addCity(saskatoon);
        list.addCity(regina);
        assertEquals(list.getCount(), 2);
        list.deleteCity(regina);
        assertEquals(list.getCount(), 1);
    }

    @Test
    public void countCitiesTest() {
        list = mockCityList();
        City vancouver = new City("Vancouver", "BC");
        City richmond = new City("Richmond", "BC");
        City burnaby = new City("Burnaby", "BC");
        list.addCity(vancouver);
        list.addCity(richmond);
        list.addCity(burnaby);
        assertEquals(list.countCities(), 3);
    }

}
