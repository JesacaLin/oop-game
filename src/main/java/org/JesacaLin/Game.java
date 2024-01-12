package org.JesacaLin;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playRound() {
        System.out.println();
        player1.makeChoice();
        player2.makeChoice();
        String winner = detemineWinner();
        System.out.println("The winner is: " + winner);
    }

    public String detemineWinner() {
        String playerChoice1 = player1.getChoice();
        String playerChoice2 = player2.getChoice();
        System.out.println("Player 1 Choice: "+ playerChoice1);
        System.out.println("Player 2 Choice: "+ playerChoice2);

        if (playerChoice1.equals(playerChoice2)) {
            return "tied";
        }
        if ((playerChoice1.equals("rock") && playerChoice2.equals("scissor")) ||
        (playerChoice1.equals("scissor") && playerChoice2.equals("paper")) ||
                (playerChoice1.equals("paper") && playerChoice2.equals("rock")))
        {
            return playerChoice1;
        }
        return playerChoice2;
    }
}
