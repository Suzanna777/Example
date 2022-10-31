package com.exampl.zoo;

import com.exampl.home.Garage;
import com.exampl.home.Home;
import com.exampl.zoo.Pet;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("lord", "boxer", true);
        Garage garage = new Garage(3);
        Home h = new Home("ormanova street", 100,
                20, 2000.00, garage, pet);

        System.out.println(h.getPeopleAmount());
        System.out.println(garage.getCars());
        System.out.println(h.isWithPet());


    }
}
