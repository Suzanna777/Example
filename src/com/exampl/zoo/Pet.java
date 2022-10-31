package com.exampl.zoo;

public class Pet {
    private String name;
    private String breed;
    private boolean sex;


    /////// Constructor With Name of the class with parameters String and Boolean Then this method = method
    public Pet(String name, String breed, boolean sex) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;


    }
//// Constructor without the parameters
    public Pet() {

    }
///// Method Get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
