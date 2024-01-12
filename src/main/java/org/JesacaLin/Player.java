package org.JesacaLin;

import java.util.Random;

public class Player {
    private String name;
    private String choice;
    private boolean isComputer;
    private static final String[] CHOICES = {"rock", "paper", "scissors"};

    public Player (String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    public String getPlayer() {
        return this.name;
    }
    public String getChoice() {
        return this.choice;
    }
    public void makeChoice(String choice) {
        if (isComputer) {
            Random random = new Random();
            this.choice = CHOICES[random.nextInt(CHOICES.length)];
        } else {
            this.choice = choice;
        }

    }

}
