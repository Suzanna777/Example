package com.exampl.zoo;

import com.exampl.home.Garage;
import com.exampl.home.Home;
import com.exampl.person.Person;
import com.exampl.zoo.Pet;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("karl", "tice", 19);
        Pet pet = new Pet("lord", "boxer", true);
        Garage garage = new Garage(3);
        Home h = new Home("ormanova street", 100,
                20, 2000.00, garage, pet);

        h.setPerson(person);

        System.out.println(h.getPerson().getFirstName());
        System.out.println(h.getPeopleAmount());
        System.out.println(garage.getCars());
        System.out.println(h.isWithPet());


    }
}
