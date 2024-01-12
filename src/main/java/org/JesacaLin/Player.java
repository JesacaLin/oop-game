package org.JesacaLin;
import java.util.Scanner;
import java.util.Random;

public class Player {
    private String name;
    private String choice;
    private boolean isComputer;
    private static final String[] CHOICES = {"rock", "paper", "scissors"};

    public Player (String name) {
        this.name = name;
    }

    public Player (String name, boolean isComputer) {
        this.name = name;
        this.isComputer = isComputer;
    }
    //getters
    public String getPlayer() {
        return this.name;
    }
    public String getChoice() {
        return this.choice;
    }
    public boolean  isComputer() {
        return this.isComputer;
    }

    public void makeChoice() {
        Scanner scanner = new Scanner(System.in);
        if (isComputer) {
            Random random = new Random();
            this.choice = CHOICES[random.nextInt(CHOICES.length)];
        } else {
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            this.choice = scanner.nextLine();

        }

    }

}
