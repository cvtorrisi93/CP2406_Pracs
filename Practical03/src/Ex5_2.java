// CP2406 Prac 3 - Christian Torrisi
//Exercise 5.2 - Statistics Calculator

import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        StatCalc calc = new StatCalc();

        Scanner userInput = new Scanner(System.in);
        double item;

        item = userInput.nextDouble();

        while (item != 0) {
            calc.enter(item);
            item = userInput.nextDouble();
        }

        System.out.println("Count: " + calc.getCount() +
                "\nSum: " + calc.getSum() +
                "\nMean: " + calc.getMean() +
                "\nStandard Deviation: " + calc.getStandardDeviation() +
                "\nMin: " + calc.getMin() +
                "\nMax: " + calc.getMax());
    }
}
