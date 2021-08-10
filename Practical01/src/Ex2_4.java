// CP2406 Prac 1 - Christian Torrisi
//Exercise 2.4 - Change Counter

import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int fiveCentCoins, tenCentCoins, twentyCentCoins, fiftyCentCoins, oneDollarCoins, twoDollarCoins;
        float total;

        System.out.println("Number of 5 cent coins: ");
        fiveCentCoins = userInput.nextInt();
        System.out.println("Number of 10 cent coins: ");
        tenCentCoins = userInput.nextInt();
        System.out.println("Number of 20 cent coins: ");
        twentyCentCoins = userInput.nextInt();
        System.out.println("Number of 50 cent coins: ");
        fiftyCentCoins = userInput.nextInt();
        System.out.println("Number of 1 dollar coins: ");
        oneDollarCoins = userInput.nextInt();
        System.out.println("Number of 2 dollar coins: ");
        twoDollarCoins = userInput.nextInt();

        total = (float) ((fiveCentCoins * 0.05) + (tenCentCoins * 0.1) + (twentyCentCoins * 0.2) + (fiftyCentCoins * 0.5) + oneDollarCoins + (twoDollarCoins * 2));

        String message = String.format("Your changes comes to a total of $%.2f", total);
        System.out.println(message);

    }
}
