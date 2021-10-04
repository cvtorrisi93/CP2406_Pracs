// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.1 - Pair Of Dice

public class PairOfDice {
    private int die1;
    private int die2;

    // Constructor to roll both die
    public PairOfDice() {
        roll();
    }

    // Roll each die
    public void roll() {
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
    }

    // Will get the value of die 1
    public int getDie1() {
        return die1;
    }

    // Will get the value of die 2
    public int getDie2() {
        return die2;
    }

    //Returns the addition of both dice
    public int getRollTotal() {
        return die1 + die2;
    }

    // String representation of the dice rolled
    @Override
    public String toString() {
        if (die1 == die2) {
            return "Double " + die1 + "\'s";
        } else {
            return die1 + " and " + die2;
        }
    }
}
