package org.example.model;

import java.util.List;

public class Game {
    public List<Player> getPlayerList() {
        return playerList;
    }

    public Board getBoard() {
        return board;
    }

    public Dice getDice() {
        return dice;
    }

    List<Player> playerList;
    Board board;
    Dice dice;
    public Game(List<Player> playerList,Board board,Dice dice) {
        this.playerList = playerList;
        this.board = board;
        this.dice = dice;
    }
    public boolean isGameFinished(Integer playerPosition) {
        return playerPosition == board.getBoardSize() * board.getBoardSize();
    }
    public int move(final int currentPos,final int diceVal) {
        int newPos = currentPos + diceVal;
        if(newPos > board.getBoardSize() * board.getBoardSize()) {
            return currentPos;
        }
        int row = (newPos - 1) / this.board.getBoardSize();
        int col = (newPos - 1) % this.board.getBoardSize();
        Cell newPosCell = this.board.getBoard()[row][col];
        if(newPosCell.getBoardItem() != null) {
            newPos = newPosCell.getBoardItem().getEndPosition();
        }
        return newPos;
    }
}
