// CP2406 Prac 2 - Christian Torrisi
//Exercise 4.2 - Snake Eyes v2.0

public class Ex4_2 {
    public static void main(String[] args) {

        int snakeEyesRollCount = getRollCount(2);

        System.out.println("Number of rolls to get Snake Eyes: " + snakeEyesRollCount);

    }

    public static int getRollCount(int expectedRoll) {
        if (expectedRoll < 2 || expectedRoll > 12) {
            throw new IllegalArgumentException("Cannot roll a " + expectedRoll);
        }
        int rollCount = 0;
        int diceTotal = 0;
        int firstDie = 0;
        int secondDie = 0;

        while (diceTotal != expectedRoll) {
            firstDie = (int) (Math.random() * 6) + 1;
            secondDie = (int) (Math.random() * 6) + 1;
            rollCount++;
            diceTotal = firstDie + secondDie;
        }
        return rollCount;
    }
}
