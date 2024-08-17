package com.education.ztu;

public class Student extends Person{
    private static int counter = 0;
    private String speciality;
    private int course;
    private String university;

    public Student(String speciality, int course, String university){
        super();
        this.speciality = speciality;
        this.course = course;
        this.university = university;
        counter++;
    }

    public Student(String firstname, String lastname, int age, Gender gender, Location location, String speciality, int course, String university){
        super(firstname, lastname, age, gender, location);
        this.speciality = speciality;
        this.course = course;
        this.university = university;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void sayOccupation() {
        System.out.println("My occupation is Student!");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
