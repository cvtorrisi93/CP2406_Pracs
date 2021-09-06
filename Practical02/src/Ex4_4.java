// CP2406 Prac 2 - Christian Torrisi
//Exercise 4.3 - Average Number of Dice Rolls

public class Ex4_4 {

    public static final int EXPERIMENTS = 10000;

    public static void main(String[] args) {
        double average;
        System.out.println("Total on Dice     Average Number of Rolls");
        System.out.println("-------------     -----------------------");
        for (int i = 2; i <= 12; i++) {
            average = getAverageRollCount(i);
            System.out.printf("%10d%22.4f\n", i, average);
        }

    }

    private static double getAverageRollCount(int expectedRollTotal) {
        double averageRollCount = 0;
        int totalRollCount = 0;
        int tempRollCount;

        for (int i = 0; i <+ EXPERIMENTS; i++) {
            tempRollCount = getRollCount(expectedRollTotal);
            totalRollCount += tempRollCount;
        }
        averageRollCount = (double)totalRollCount / EXPERIMENTS;

        return averageRollCount;
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
