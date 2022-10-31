package com.exampl.home;

import com.exampl.home.Garage;
import com.exampl.zoo.Pet;

public class Home {
    private String street;
    private int width;
    private int height;
    private double price;
    private Garage garage;
    private Pet pet;

    public Home() {

    }

    public Home(String street, int width, int height, double price, Garage garage) {
        this.street = street;
        this.width = width;
        this.garage = garage;
        this.price = price;
        this.height = height;

    }



    public Home(String street, int width, int height, double price, Garage garage, Pet pet) {
        this.street = street;
        this.width = width;
        this.garage = garage;
        this.price = price;
        this.height = height;
        this.pet = pet;

    }

    public int getPeopleAmount() {
        int passengers = 4;
        int result = 4;
        result = garage.getCars() * passengers;
        return result;

    }



    public boolean isWithPet(){
        return this.pet != null;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
