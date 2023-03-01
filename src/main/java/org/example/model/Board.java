package org.example.model;

import java.util.List;

public class Board {
    public Cell[][] getBoard() {
        return board;
    }

    private final Cell[][] board;
    private final int boardSize;

    public int getBoardSize() {
        return boardSize;
    }

    public Board(int boardSize) {
        this.boardSize = boardSize;
        board = new Cell[boardSize][boardSize];
        for(int i = 0;i<boardSize;i++) {
            for(int j = 0;j<boardSize;j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public void addSnakes(int[][] snakes) {
        for (int[] snake: snakes) {
            int startNumber = snake[1] - 1;
            int row = startNumber / boardSize;
            int col = startNumber % boardSize;
            board[row][col].setBoardItem(new BoardItem(snake[0]));
        }
    }

    public void addLadders(int[][] ladders) {
        for (int[] ladder: ladders) {
            int startNumber = ladder[0] - 1;
            int row = startNumber / boardSize;
            int col = startNumber % boardSize;
            board[row][col].setBoardItem(new BoardItem(ladder[1]));
        }
    }
}
