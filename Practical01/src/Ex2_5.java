// CP2406 Prac 1 - Christian Torrisi
//Exercise 2.5 - Egg Counter

import java.util.Scanner;

public class Ex2_5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int eggs;

        System.out.println("How many eggs?");
        eggs = userInput.nextInt();

        int gross = 0;
        if (eggs >= 144) {
            gross = eggs/144;
            eggs = eggs%144;
        }

        int dozen = 0;
        if (eggs >= 12) {
            dozen = eggs/12;
            eggs = eggs%12;
        }

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + eggs);
    }
}
