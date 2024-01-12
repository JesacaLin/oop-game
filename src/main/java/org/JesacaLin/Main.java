package org.JesacaLin;
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Alex", true);
        Player player2 = new Player("Chris", true);
        Game game = new Game(player1, player2);
        game.playRound();
    }
}