package org.example.model;

public class Dice {
    private final int diceCount;
    public Dice(final int diceCount) {
        this.diceCount = diceCount;
    }
    public int rollDice() {
        int finalNumber = 0;
        int currentNumber = 0;
        for(int i = 0;i<diceCount;i++) {
            currentNumber = (int) Math.floor(Math.random() * 6) + 1;
            finalNumber += currentNumber;
        }
        return finalNumber;
    }
}
