package com.education.ztu;

public class Employee extends Person{
    private static int counter = 0;
    private String company;
    private String position;
    private Car car;

    public Employee(String company, String position, Car car){
        super();
        this.company = company;
        this.position = position;
        this.car = car;
        counter++;
    }

    public Employee(String firstname, String lastname, int age, Gender gender, Location location, String company, String position, Car car){
        super(firstname, lastname, age, gender, location);
        this.company = company;
        this.position = position;
        this.car = car;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void sayOccupation() {
        System.out.println("My occupation is Employee!");
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
