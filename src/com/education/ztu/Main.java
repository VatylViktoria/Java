package com.education.ztu;

import com.education.ztu.game.Student;
import com.education.ztu.game.Team;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Stasie", 19);
        Student s2 = new Student("Klavdia", 18);
        System.out.println(s1);
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equals: " + s1.equals(s1));
        System.out.println("hashCode: " + s1.hashCode());
        Student s3 = (Student) s1.clone();
        s3.setAge(12);
        System.out.println("clone 1: " + s1);
        System.out.println("clone 2: " + s3);
        Team<Student> t1 = new Team<>("Sharks");
        t1.addNewParticipant(s1);
        System.out.println(t1);
        Team<Student> t2 = new Team<>(t1);
        System.out.println(t2);
    }
}
