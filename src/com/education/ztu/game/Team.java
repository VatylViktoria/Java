package com.education.ztu.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public Team(Team<T> team){
        this.name = team.getName();
        this.participants = new ArrayList<>(team.getParticipants());
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("To the team " + name + " was added participant " + participant.getName() + "!");
    }
    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("The team " + winnerName + " is winner!");
    }

    public String getName() {
        return name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParticipants(List<T> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        String result = String.format("Team %s:%n", name);
        for (T participant : participants) {
            result += String.format("%s%n", participant.getName());
        }
        return result;
    }
}
