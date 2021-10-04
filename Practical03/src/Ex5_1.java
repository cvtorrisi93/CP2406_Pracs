// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.1 - Pair Of Dice

public class Ex5_1 {
    public static void main(String[] args) {
        // Initialise variables
        PairOfDice dice = new PairOfDice();
        int rollCount = 0;

        // while the roll isn't Snake eyes, roll again
        do {
            dice.roll();
            System.out.println("This roll you got " + dice);
            rollCount++;
        } while (dice.getRollTotal() != 2);

        // Show how many roll it took to get Snake Eyes.
        System.out.println("It has taken " + rollCount + " rolls to get Snake Eyes!");
    }

}
