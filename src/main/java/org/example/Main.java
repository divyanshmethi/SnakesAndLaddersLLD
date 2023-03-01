package org.example;

import org.example.controller.GameController;

public class Main {
    public static void main(String[] args) {
        GameController game = new GameController();
        int[][] snakes = new int[1][2];
        //Input here is given with 1 based indexing
        snakes[0] = new int[]{13,17};
        int[][] ladders = new int[2][2];
        ladders[0] = new int[]{2,15};
        ladders[1] = new int[]{14,35};
        game.initGame(2,1,snakes,ladders,6);
        game.playGame();
    }
}