package com.education.ztu.game;

import java.util.Comparator;
import java.util.TreeSet;

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Sergey", 14);
        Schoolar schoolar2 = new Schoolar("Elena", 15);
        Student student1 = new Student("Viktoriia", 19);
        Student student2 = new Student("Lilya", 20);
        Employee employee1 = new Employee("Boris", 28);
        Employee employee2 = new Employee("Ulij", 25);
        Team<Schoolar> scollarTeam = new Team<>("Eagles");
        scollarTeam.addNewParticipant(schoolar1);
        scollarTeam.addNewParticipant(schoolar2);

        Team<Student> studentTeam = new Team<>("Sharks");
        studentTeam.addNewParticipant(student2);
        studentTeam.addNewParticipant(student1);
        Team<Employee> employeeTeam = new Team<>("Horses");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        System.out.println(studentTeam);

        Team<Schoolar> scollarTeam2 = new Team<>("Snakes");
        Schoolar schoolar3 = new Schoolar("Choongook", 13);
        Schoolar schoolar4 = new Schoolar("Anatoliy", 14);
        scollarTeam2.addNewParticipant(schoolar3);
        scollarTeam2.addNewParticipant(schoolar4);
        scollarTeam.playWith(scollarTeam2);

        Comparator<Participant> scomp = new ParticipantNameComparator().thenComparing(new ParticipantAgeComparator());
        TreeSet<Participant> participants = new TreeSet<>(scomp);
        participants.addAll(studentTeam.getParticipants());
        System.out.println(studentTeam.getParticipants());
        for(Participant p: participants){
            System.out.println(p);
        }
    }
}
