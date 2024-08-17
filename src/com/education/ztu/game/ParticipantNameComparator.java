package com.education.ztu.game;

import java.util.Comparator;

public class ParticipantNameComparator implements Comparator<Participant> {
    @Override
    public int compare(Participant o1, Participant o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
