package org.example.controller;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    Game game;
    public void initGame(int numPlayers, int diceCount, int[][] snakes, int[][] ladders, int boardSize) {
        List<Player> players = new ArrayList<>();
        Dice dice = new Dice(diceCount);
        for(int i = 0;i<numPlayers;i++) {
            players.add(new Player(i+1));
        }
        Board playingBoard = new Board(boardSize);
        playingBoard.addSnakes(snakes);
        playingBoard.addLadders(ladders);
        game = new Game(players,playingBoard,dice);
    }
    public void playGame() {
        int playerIndex = 0;
        while(true) {
            System.out.println("Player " + (playerIndex + 1));
            Player currentPlayer = this.game.getPlayerList().get(playerIndex);
            int currentPosition = currentPlayer.getPosition();
            System.out.println("Your current position is : " + currentPosition);
            System.out.print("Press enter to roll the dice : ");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            int diceVal = this.game.getDice().rollDice();
            System.out.println("You got " + diceVal);
            int newPosition = this.game.move(currentPosition,diceVal);
            if(this.game.isGameFinished(newPosition)) {
                break;
            } else {
                System.out.println("You have moved to : " + newPosition);
                currentPlayer.setPosition(newPosition);
            }
            playerIndex = (playerIndex + 1) % this.game.getPlayerList().size();
        }
        System.out.println("Player " + (playerIndex + 1) + " won.");
    }
}
