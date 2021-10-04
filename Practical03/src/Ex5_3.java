// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.3 - Statistics Calculator & Pair of Dice

public class Ex5_3 {

    static final int EXPERIMENTS = 10000;
    private static PairOfDice dice = new PairOfDice();

    public static void main(String[] args) {
        System.out.println("Dice Total   Avg # of Rolls   Stand. Deviation   Max # of Rolls");
        System.out.println("----------   --------------   ----------------   --------------");

        for (int total = 2;  total <= 12;  total++) {
            StatCalc statistics;
            statistics = new StatCalc();
            for ( int i = 0; i < EXPERIMENTS; i++ ) {
                statistics.enter(rollForTotal(total));
            }
            System.out.printf("%6d", total);
            System.out.printf("%18.3f", statistics.getMean());
            System.out.printf("%19.3f", statistics.getStandardDeviation());
            System.out.printf("%14.3f", statistics.getMax());
            System.out.println();
        }
    }

    static int rollForTotal(int number) {
        int rollCount = 0;
        do {
            dice.roll();
            rollCount++;
        } while (dice.getRollTotal() != number);
        return rollCount;
    }

}
