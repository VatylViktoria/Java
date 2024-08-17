package com.education.ztu;

public class Teacher extends Person {
    private static int counter = 0;
    private String subject;
    private String university;
    private Car car;

    public Teacher(String subject, String university, Car car){
        super();
        this.subject = subject;
        this.university = university;
        this.car = car;
        counter++;
    }

    public Teacher(String firstname, String lastname, int age, Gender gender, Location location, String subject, String university, Car car){
        super(firstname, lastname, age, gender, location);
        this.subject = subject;
        this.university = university;
        this.car = car;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void sayOccupation() {
        System.out.println("My occupation is Teacher!");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
