package com.exampl.Suzanna;

public class Pet {
    private String activity;
    private int age;
    private String name;

    ///// constructor
    public Pet() {

    }

    public Pet(int age, String activity, String name){
        this.age = age;
        this.name = name;
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Pet p = new Pet (2, "Pleas do not bark", "Malish");
        System.out.println(p.getActivity());
        System.out.println(p.age);
        System.out.println(p.name);
    }
}
